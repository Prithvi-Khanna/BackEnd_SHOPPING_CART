use ecom;
select * from items;
select * from users;
create table items (product_id bigint not null auto_increment, category varchar(255),  subcategory varchar(255),name varchar(255),description varchar(255),  price double precision not null, img varchar(255), primary key (product_id));
insert into items
values
 (1,'Women','T-shirt','H&M','Women Pink Striped High-Low Round Neck T-shirt',3499,'/assets/1.jpg'),
(2,'Women','T-shirt','H&M','Women Black Solid V Neck T-shirt',3500,'/assets/2.jpg'),
 (3,'Women','T-shirt','H&M','Women Red Solid  Round Neck T-shirt',2499,'/assets/3.jpg'),
 (4,'Women','T-shirt','Puma','Women Yellow Polo T-shirt',1999,'/assets/4.jpg'),
 (5,'Women','T-shirt','Puma','Women White Polo T-shirt',2000,'/assets/5.jpg'),
 (6,'Women','T-shirt','Adidas','Women Green Polo T-shirt',300,'/assets/2.jpg'),
(7,'Women','T-shirt','Adidas','Women Black Round Neck T-shirt',3754,'/assets/7.jpg'),
 (8,'Women','T-shirt','GAP','Women Pink Striped V Neck T-shirt',2045,'/assets/1.jpg'),
 (9,'Men','T-shirt','GAP','men Red Striped High-Low Round Neck T-shirt',1244,'/assets/9.jpg'),
 (10,'Men','T-shirt','Levis','men Blue Polo T-shirt',1193,'/assets/10.jpg'),
 (11,'Men','T-shirt','Levis','men Black Round Neck T-shirt',655,'/assets/11.jpg'),
 (12,'Men','T-shirt','Levis','men Brown Solid High-Low Round Neck T-shirt',874,'/assets/12.jpg'),
 (13,'Men','T-shirt','GAP','men Green V Neck T-shirt',542,'/assets/13.jpg'),
 (14,'Men','T-shirt','H&M','men Yellow Polo T-shirt',1599,'/assets/14.jpg'),
 (15,'Men','Jeans','Levis','Men Blue 512 Slim Taper Fit Low-Rise Clean Look Stretchable Jeans',5499,'/assets/15.jpg'),
 (16,'Men','Jeans','Levis','Men Blue Regular Fit Jeans',5499,'/assets/16.jpg');
INSERT INTO items VALUES (31,'Women','Shoes','Adidas','Women Grey Sneakers',6999,'/assets/31.jpg');
INSERT INTO items VALUES (32,'Women','Shoes','H&M','Women white Sneakers',8499,'/assets/32.jpg');
INSERT INTO items VALUES (33,'Women','Shoes','H&M','Women Grey Sneakers',1399,'/assets/33.jpg');
INSERT INTO items VALUES (34,'Men','Shoes','Puma','Men Black Sports',4999,'/assets/23.jpg');
INSERT INTO items VALUES (35,'Electronics','Phone','Samsung','Samsung Galaxy S10+ Plus G975F GSM Unlocked Smartphone (Prism White, 128GB)',50000,'/assets/Electronics/1.jpg');
INSERT INTO items VALUES (36,'Electronics','Phone','Samsung','Samsung Galaxy S9 G975F GS Smartphone (White, 128GB)',42000,'/assets/Electronics/1.jpg');
INSERT INTO items VALUES (37,'Electronics','Phone','Apple','Apple iPhone 7, 128GB, Red - For AT&T / T-Mobile (Renewed)',48000,'/assets/Electronics/2.png');
INSERT INTO items VALUES (38,'Electronics','Phone','Apple','Apple iPhone 8, 64GB, Silver - For Verizon (Renewed)',36000,'/assets/Electronics/3.jpg');
INSERT INTO items VALUES (39,'Electronics','Phone','One Plus','One Plus Stylo 4, Metro Pcs Unlocked GSM Unlocked 32 GB (Renewed)',50000,'/assets/Electronics/4.jpg');
INSERT INTO items VALUES (40,'Electronics','Headphones','Skull Candy','On Ear Headphones with Mic, Vogek Lightweight Portable Fold-Flat Stereo Bass Headphones with 1.5M Tangle Free Cord',14000,'/assets/Electronics/6.jpg');
INSERT INTO items  VALUES (41,'Electronics','Headphones','Skull Candy','Mpow 059 Bluetooth Headphones Over Ear, Hi-Fi Stereo Wireless Headset, Foldable, Soft Memory-Protein Earmuff',18000,'/assets/Electronics/6.jpg');
INSERT INTO items VALUES (42,'Electronics','Headphones','Boat','LHWIBD ZX Series Stereo Headphones',7000,'/assets/Electronics/7.jpg');
INSERT INTO items VALUES (43,'Electronics','Headphones','Boat','MDRZX110/BLK ZX Series Stereo Headphones (Black)',9800,'/assets/Electronics/8.jpg');
INSERT INTO items VALUES (44,'Electronics','Headphones','Boat','CVBN 12UU Series Stereo Headphones (White)',5999,'/assets/Electronics/9.jpg');
INSERT INTO items VALUES (45,'Books','Novel','Meluha','Immortals of Meluha (The Shiva Trilogy Book 1)',150,'/assets/Books/1.jpg');
INSERT INTO items VALUES (46,'Books','Novel','Secret of Nagas','Amish Tripathi ''S Shiva Trilogy-nagas, Mehula & the Oath of the Vayuputras',600,'/assets/Books/2.jpg');
INSERT INTO items VALUES (47,'Books','Novel','Scion of Ishvaku','Ram - Scion of Ikshvaku (Ram Chandra Book 1)',249,'/assets/Books/3.jpg');
INSERT INTO items VALUES (48,'Books','Biography','APJ Abdul Kalam','Wings of Fire: An Autobiography (Digital Exclusive Edition)',139,'/assets/Books/5.jpg');
INSERT INTO items VALUES (49,'Books','Biography','APJ Abdul Kalam','My Journey: Transforming Dreams Into Actions',370,'/assets/Books/4.jpg');
INSERT INTO items VALUES (50,'Books','Biography','APJ Abdul Kalam','Sory of My Life',280,'/assets/Books/5.jpg');
INSERT INTO items VALUES (51,'Sports','Cricket','Bat','Cricket Bat English Willow SG VS 319 Extreme',6999,'/assets/Sports/1.jpg');
INSERT INTO items VALUES (52,'Sports','Cricket','Ball','Champion Sports Nylon Outdoor Leather Ball',599,'/assets/Sports/2.jpg');
INSERT INTO items  VALUES (53,'Sports','Football','Football','SKLZ Star-Kick Hands Free Solo Soccer Trainer- Fits Ball Size 3, 4, and 5',3999,'/assets/Sports/3.jpg');
INSERT INTO items VALUES (54,'Sports','Badminton','Shuttlecock','Champion Sports Nylon Outdoor Shuttlecocks',150,'/assets/Sports/4.jpg');
INSERT INTO items VALUES (55,'Kids','T-shirt','H&M','Black Solid V Neck T-shirt',3500,'/assets/2.jpg');
INSERT INTO items VALUES (56,'Kids','T-shirt','GAP','Red Striped High-Low Round Neck T-shirt',1244,'/assets/9.jpg');
INSERT INTO items VALUES (57,'Kids','Jeans','H&M','Black Slim Taper Fit Jeans',6434,'/assets/18.jpg');
INSERT INTO items VALUES (58,'Kids','Jeans','Levis','Blue 512 Slim Taper Fit Low-Rise Clean Look Stretchable Jeans',5499,'/assets/15.jpg');
INSERT INTO items VALUES (59,'Kids','Shoes','H&M','Grey Sneakers',1399,'/assets/33.jpg');
INSERT INTO items VALUES (60,'Kids','Shoes','Puma','Black Sports',4999,'/assets/23.jpg');

