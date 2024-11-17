-- Create table
CREATE TABLE IF NOT EXISTS customer (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(80) NOT NULL,
                        personal_number VARCHAR(20) UNIQUE NOT NULL,
                        address TEXT,
                        mobile_number VARCHAR(20) NOT NULL,
                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);