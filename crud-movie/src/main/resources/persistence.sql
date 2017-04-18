-- user=root, password=root
Create database playground;
Create table `movie`(
    `id` int(3) NOT NULL AUTO_INCREMENT, 
    `title` VARCHAR(100) NOT NULL, 
    `year` int (4), 
    primary key (`id`)
);