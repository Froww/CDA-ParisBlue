
-- Insertion de données initiales pour `person`
INSERT INTO `person` (`email`, `firstname`, `lastname`, `phone`) VALUES
('john.doe@example.com', 'John', 'Doe', '1234567890'),
('jane.smith@example.com', 'Jane', 'Smith', '0987654321');

-- Insertion de données initiales pour `account`
INSERT INTO `account` (`account_creation_date`, `password`, `username`, `person_id`) VALUES
('2023-04-01 10:00:00', 'password123', 'john.doe', 1),
('2023-04-02 11:00:00', 'password789', 'jane.smith', 2);

-- Insertion de données initiales pour `room`
INSERT INTO `room` (`capacity`, `room_number`, `room_type`) VALUES
(2, 101, 'DOUBLE'),
(4, 102, 'FAMILY');

-- Insertion de données initiales pour `offer`
INSERT INTO `offer` (`nightly_rate`, `offer_start_date`, `offer_end_date`, `room_room_id`) VALUES
(100.00, '2023-05-01', '2023-05-10', 1),
(150.00, '2023-05-11', '2023-05-20', 2);

-- Insertion de données initiales pour `reservation`
INSERT INTO `reservation` (`actual_check_in_date`, `actual_check_out_date`, `cancellation_reason`, `modification_date`, `planned_check_in_date`, `planned_check_out_date`, `reservation_date`, `reservation_number`, `person_person_id`) VALUES
('2023-05-01 14:00:00', '2023-05-05 11:00:00', NULL, NULL, '2023-05-01', '2023-05-05', '2023-04-20 10:00:00', 'RES123456', 1),
('2023-05-11 14:00:00', '2023-05-15 11:00:00', NULL, NULL, '2023-05-11', '2023-05-15', '2023-04-25 10:00:00', 'RES654321', 2);

-- Insertion de données initiales pour `room_occupation`
INSERT INTO `room_occupation` (`occupation_end`, `occupation_start`, `room_room_id`) VALUES
('2023-05-05', '2023-05-01', 1),
('2023-05-15', '2023-05-11', 2);