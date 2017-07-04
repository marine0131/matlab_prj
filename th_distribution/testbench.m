t_h = 't';
inputMat=[50 50 10 ;100 100 20; 200 200 22; 300 300 24; 1000 1000 30];
limit=[10 50];
temp_img='temp.png';
room_map='jifang.png';
output_path='.';
output_filename='output.png';
res = th_distribution(t_h,inputMat,limit,temp_img,room_map,output_path,output_filename)