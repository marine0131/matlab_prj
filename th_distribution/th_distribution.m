%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%结合机房地图的温度分布图
%t_h: 温度('t')or湿度('h')
%inputMat:输入数据, (x,y,t)
%limit:温湿度分布上下限，(min max),limit区间越小，不同温湿度间的颜色区分越明显
%temp_map:临时生成文件目录和文件名'./temp.png'
%room_map:机房地图字段,'room_map.png'
%output_path：输出图像路径 '/mypath'
%output_name:输出图像的文件名
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

function result = th_distribution(t_h,inputMat,limit,temp_img,room_map,output_path,output_name)
if ~exist('t_h','var')
    result = 'error:t_h is not assigned';
elseif ~exist('inputMat','var')
    result = 'error:inputMat is not assigned';
elseif ~exist('room_map','var')
    result = 'error:room_map is not assigned';
else
    if ~exist('limit','var')
        if t_h=='t'
            limit=[5 50];
        elseif t_h=='h'
            limit=[0.2 0.9];
        else
        end
    end
    if ~exist('temp_map','var')
        temp_img='temp.png';
    end
    if ~exist('output_path','var')
        output_path='.';
    end
    if ~exist('output_name','var')
        output_name='output.png';
    end
% img=imread('company_map.pgm');
% min_x = 1;
% min_y = 1;
% [max_x,max_y,n] = size(img);
% 
% figure;
% imagesc([min_x max_x],[min_y max_y],img);
% 
% hold on;
% 
%底图设置透明度
% im_src = 'jifang.png';
% x=[50,100,200,300,1000];
% y=[50,100,200,300,1000];
% z=[10,20,22,24,30];
% temp ='temp.png'
% limit = [10 50]

x=inputMat(:,1);
y=inputMat(:,2);
z=inputMat(:,3);

[I1,~,~] =imread(room_map); %read room map image
map_size = size(I1);%map size (rows,cols,color)
idx1 = ones(map_size(1),map_size(2));
%idx2 = ones(m, n);
%idx3 = ones(m, n);
idx1( I1(:,:,1) >= 253 ) = 0;
%idx2( RGB_in(:,:,2) >= 253 ) = 0;
%idx3( RGB_in(:,:,3) >= 253 ) = 0;
% write to a PNG file, 'Alpha' indicates the transparent parts
%trans_val = idx1 .* idx2 .* idx3;
trans_val = idx1;
%imwrite( RGB_in, im_out, 'png', 'Alpha', trans_val );

[X,Y,Z] = griddata(x,y,z,linspace(min(x),max(x),100)',linspace(min(y),max(y),100),'v4');%v4 nterpolation, generate matrix
Z(Z>max(z))=max(z);
Z(Z<min(z))=min(z);
figure('visible','off'); %do not show figure
surf(X,Y,Z);%surface
aa = zeros(30,3);
aa(:,3)=1;
aa(:,2)=linspace(0,1,30);
myjet = aa;
aa(:,1)=linspace(0,1,30);
aa(:,2)=1;
aa(:,3)=linspace(1,0,30);
myjet = [myjet;aa];
aa(:,1)=1;
aa(:,2)=linspace(1,0,30);
aa(:,3)=0;
myjet = [myjet;aa];
colormap(myjet);
shading interp;
caxis(limit);
xlim([0 map_size(2)]);
ylim([0 map_size(1)]);
axis off;
% set(hs,'FaceAlpha',0.8); %set transparent
view(0,90); %perspective
%colorbar('position',[0.95 0.1 1.0 0.8])
%set(gcf,'Position',[100 10 800 600]);%set image size   
set(gca,'Units','normalized','Position',[0 0 1 1]); %save plot without blank
set(gca,'YDir','reverse')%reverse the y axis
set(gcf,'PaperUnits','inches','PaperPosition',[0 0 map_size(2)/75 map_size(1)/75]);
%mycmap=get(gcf,'colormap');
print(gcf,'-dpng','-r75',temp_img);

I2=imread(temp_img);
imshow(I2); %show room map

% [ROOM_X,ROOM_Y]=meshgrid(1:size(ROOM,1),1:size(ROOM,2));
% ROOM_X = ROOM_X';
% ROOM_Y = ROOM_Y';
% figure('visible','on');
% hr = surf(ROOM_X,ROOM_Y,ROOM);
% colormap(gray(256));

%view(0,90); %perspective
%set(h,'AlphaData',trans_val);%set room map transparent color

%imagesc([1 max_x],[1 max_y],flipud(room));
hold on
h=imshow(I1);
set(h,'AlphaData',trans_val);%set room map transparent color
hold off
if ~exist(output_path,'dir') 
    mkdir(output_path)   %create a path if the path not exist
end 
mypath = [output_path,'\'];
mypath = [mypath,output_name];%assemble path and filename
saveas(gcf,mypath);%save figure to mypath

close all;
clear x y z I1 map_size idx1 trans_val X Y Z aa my_jet I2 h;

result = 'success';
end