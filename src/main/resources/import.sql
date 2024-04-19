USE `hotel_paris_blue_db`;

-- Insertion de données initiales pour `person`
INSERT INTO `person` (`email`, `firstname`, `lastname`, `phone`) VALUES ('john.doe@example.com', 'John', 'Doe', '1234567890');
INSERT INTO `person` (`email`, `firstname`, `lastname`, `phone`) VALUES ('jane.smith@example.com', 'Jane', 'Smith', '0987654321');
INSERT INTO `person` (`email`, `firstname`, `lastname`, `phone`) VALUES ('alice.johnson@example.com', 'Alice', 'Johnson', '1231231231');

-- Insertion de données initiales pour `account`
INSERT INTO `account` (`account_creation_date`, `password`, `username`, `person_id`) VALUES ('2023-04-01 10:00:00', 'password123', 'john.doe', 1);
INSERT INTO `account` (`account_creation_date`, `password`, `username`, `person_id`) VALUES ('2023-04-02 11:00:00', 'password789', 'jane.smith', 2);
INSERT INTO `account` (`account_creation_date`, `password`, `username`, `person_id`) VALUES ('2023-04-03 09:00:00', 'pass456', 'alice.j', 3);

-- Insertion de données initiales pour `room`
INSERT INTO `room` (`capacity`, `room_number`, `room_type`) VALUES (2, 101, 'DOUBLE');
INSERT INTO `room` (`capacity`, `room_number`, `room_type`) VALUES (4, 102, 'FAMILY');
INSERT INTO `room` (`capacity`, `room_number`, `room_type`) VALUES (1, 103, 'SIMPLE');

-- Insertion de données initiales pour `offer`
INSERT INTO `offer` (`nightly_rate`, `offer_start_date`, `offer_end_date`, `room_room_id`) VALUES (100.00, '2023-05-01', '2023-05-10', 1);
INSERT INTO `offer` (`nightly_rate`, `offer_start_date`, `offer_end_date`, `room_room_id`) VALUES (150.00, '2023-05-11', '2023-05-20', 2);
INSERT INTO `offer` (`nightly_rate`, `offer_start_date`, `offer_end_date`, `room_room_id`) VALUES (75.00, '2023-05-21', '2023-05-30', 3);

-- Insertion de données initiales pour `reservation`
INSERT INTO `reservation` (`actual_check_in_date`, `actual_check_out_date`, `planned_check_in_date`, `planned_check_out_date`, `reservation_date`, `reservation_number`, `person_person_id`) VALUES ('2023-05-01 14:00:00', '2023-05-05 11:00:00', '2023-05-01', '2023-05-05', '2023-04-20 10:00:00', 'RES123456', 1);
INSERT INTO `reservation` (`actual_check_in_date`, `actual_check_out_date`, `planned_check_in_date`, `planned_check_out_date`, `reservation_date`, `reservation_number`, `person_person_id`) VALUES ('2023-05-11 14:00:00', '2023-05-15 11:00:00', '2023-05-11', '2023-05-15', '2023-04-25 10:00:00', 'RES654321', 2);
INSERT INTO `reservation` (`actual_check_in_date`, `actual_check_out_date`, `planned_check_in_date`, `planned_check_out_date`, `reservation_date`, `reservation_number`, `person_person_id`) VALUES ('2023-05-21 14:00:00', '2023-05-25 11:00:00', '2023-05-21', '2023-05-25', '2023-05-01 10:00:00', 'RES789012', 3);

-- Insertion de données initiales pour `room_occupation`
INSERT INTO `room_occupation` (`occupation_end`, `occupation_start`, `room_room_id`) VALUES ('2023-05-05', '2023-05-01', 1);
INSERT INTO `room_occupation` (`occupation_end`, `occupation_start`, `room_room_id`) VALUES ('2023-05-15', '2023-05-11', 2);
INSERT INTO `room_occupation` (`occupation_end`, `occupation_start`, `room_room_id`) VALUES ('2023-05-25', '2023-05-21', 3);