for i=1:10
close all
clear all


t_h = 't';
%inputMat=[187 200 35 ;696 253 20; 546 877 22; 413 935 35; 200 930 45];
lyg_t = load('lyg_t.mat');
inputMat= lyg_t.lyg_t;
[points, dim] = size(inputMat);
inputMat(:,2) = 992 - inputMat(:,2);
T = [0.092857,  -1.010563; 
    1.010575,   0.091838; 
    280.871462, 818.409689]; 
transferMat = [inputMat(:,1:2), ones(points,1)] * T;
inputMat = [transferMat, inputMat(:,3)];


map = 'lygyd_real';
limit=[15 40];
room_map= [map , '.png'];
output_path = '.';
output_filename = [map , '_output111.png'];
temp_map = [map, '_temp111.png'];

    res = th_distribution(t_h,inputMat,limit,temp_map,room_map,output_path,output_filename);
end