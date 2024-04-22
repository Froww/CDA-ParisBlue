
-- Données pour la table `person`
INSERT INTO `person` (person_id, email, firstname, lastname, phone) VALUES (1, 'john.doe@example.com', 'John', 'Doe', '1234567890');
INSERT INTO `person` (person_id, email, firstname, lastname, phone) VALUES (2, 'jane.smith@example.com', 'Jane', 'Smith', '0987654321');
INSERT INTO `person` (person_id, email, firstname, lastname, phone) VALUES (3, 'alice.johnson@example.com', 'Alice', 'Johnson', '1231231231');

-- Données pour la table `room`
INSERT INTO `room` (room_id, capacity, room_number, room_type) VALUES (1, 2, 101, 'DOUBLE');
INSERT INTO `room` (room_id, capacity, room_number, room_type) VALUES (2, 4, 102, 'FAMILY');
INSERT INTO `room` (room_id, capacity, room_number, room_type) VALUES (3, 3, 103, 'SINGLE');

-- Données pour la table `offer`
INSERT INTO `offer` (offer_id, nightly_rate, offer_start_date, offer_end_date, room_room_id) VALUES (1, 100.00, '2023-05-01', '2023-05-10', 1);
INSERT INTO `offer` (offer_id, nightly_rate, offer_start_date, offer_end_date, room_room_id) VALUES (2, 150.00, '2023-05-11', '2023-05-20', 2);
INSERT INTO `offer` (offer_id, nightly_rate, offer_start_date, offer_end_date, room_room_id) VALUES (3, 75.00, '2023-05-21', '2023-05-30', 3);

-- Données pour la table `reservation`
INSERT INTO `reservation` (reservation_id, planned_arrival_date, planned_departure_date, actual_check_in_date, actual_check_out_date, reservation_date, reservation_number, person_person_id, offer_offer_id) VALUES (1, '2023-05-01', '2023-05-05', '2023-05-01 14:00:00', '2023-05-05 11:00:00', '2023-04-20 10:00:00', 'RES123456', 1, 1);
INSERT INTO `reservation` (reservation_id, planned_arrival_date, planned_departure_date, actual_check_in_date, actual_check_out_date, reservation_date, reservation_number, person_person_id, offer_offer_id) VALUES (2, '2023-05-11', '2023-05-15', '2023-05-11 14:00:00', '2023-05-15 11:00:00', '2023-04-25 10:00:00', 'RES654321', 2, 2);
INSERT INTO `reservation` (reservation_id, planned_arrival_date, planned_departure_date, actual_check_in_date, actual_check_out_date, reservation_date, reservation_number, person_person_id, offer_offer_id) VALUES (3, '2023-05-21', '2023-05-25', '2023-05-21 14:00:00', '2023-05-25 11:00:00', '2023-05-01 10:00:00', 'RES789012', 3, 3);

-- Données pour la table `room_occupation`
INSERT INTO `room_occupation` (room_occupation_id, occupation_end, occupation_start, room_room_id) VALUES (1, '2023-05-05', '2023-05-01', 1);
INSERT INTO `room_occupation` (room_occupation_id, occupation_end, occupation_start, room_room_id) VALUES (2, '2023-05-15', '2023-05-11', 2);
INSERT INTO `room_occupation` (room_occupation_id, occupation_end, occupation_start, room_room_id) VALUES (3, '2023-05-25', '2023-05-21', 3);

-- Données pour la table `roles`
INSERT INTO roles (name) VALUES ('USER');

-- Données pour la table `account`
INSERT INTO `account` (`account_creation_date`, `password`, `username`, `person_id`) VALUES ('2023-04-01 10:00:00', 'password123', 'john.doe', 1);
INSERT INTO `account` (`account_creation_date`, `password`, `username`, `person_id`) VALUES ('2023-04-02 11:00:00', 'password789', 'jane.smith', 2);
INSERT INTO `account` (`account_creation_date`, `password`, `username`, `person_id`) VALUES ('2023-04-03 09:00:00', 'pass456', 'alice.j', 3);

-- Données pour la table `account_role`
INSERT INTO account_role (account_id, role_id) VALUES (1, 1);
INSERT INTO account_role (account_id, role_id) VALUES (2, 1);
INSERT INTO account_role (account_id, role_id) VALUES (3, 1);