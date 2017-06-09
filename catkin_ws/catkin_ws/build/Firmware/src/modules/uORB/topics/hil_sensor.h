/****************************************************************************
 *
 *   Copyright (C) 2013-2016 PX4 Development Team. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 * 3. Neither the name PX4 nor the names of its contributors may be
 *    used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS
 * OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 ****************************************************************************/

/* Auto-generated by genmsg_cpp from file /home/wonsik/catkin_ws/src/Firmware/msg/hil_sensor.msg */


#pragma once

#include <stdint.h>
#ifdef __cplusplus
#include <cstring>
#else
#include <string.h>
#endif

#include <uORB/uORB.h>


#ifndef __cplusplus
#define MAGNETOMETER_MODE_NORMAL 0
#define MAGNETOMETER_MODE_POSITIVE_BIAS 1
#define MAGNETOMETER_MODE_NEGATIVE_BIAS 2

#endif


#ifdef __cplusplus
struct __EXPORT hil_sensor_s {
#else
struct hil_sensor_s {
#endif
	uint64_t timestamp; // required for logger
	uint64_t accelerometer_timestamp;
	uint64_t magnetometer_timestamp;
	uint64_t gyro1_timestamp;
	uint64_t accelerometer1_timestamp;
	uint64_t magnetometer1_timestamp;
	uint64_t gyro2_timestamp;
	uint64_t accelerometer2_timestamp;
	uint64_t magnetometer2_timestamp;
	uint64_t baro_timestamp;
	uint64_t baro1_timestamp;
	uint64_t differential_pressure_timestamp;
	uint64_t differential_pressure1_timestamp;
	float gyro_rad_s[3];
	uint32_t gyro_errcount;
	float gyro_temp;
	float accelerometer_m_s2[3];
	float accelerometer_range_m_s2;
	uint32_t accelerometer_errcount;
	float accelerometer_temp;
	float magnetometer_ga[3];
	float magnetometer_range_ga;
	float magnetometer_cuttoff_freq_hz;
	uint32_t magnetometer_errcount;
	float magnetometer_temp;
	float gyro1_rad_s[3];
	uint32_t gyro1_errcount;
	float gyro1_temp;
	float accelerometer1_m_s2[3];
	uint32_t accelerometer1_errcount;
	float accelerometer1_temp;
	float magnetometer1_ga[3];
	uint32_t magnetometer1_errcount;
	float magnetometer1_temp;
	float gyro2_rad_s[3];
	uint32_t gyro2_errcount;
	float gyro2_temp;
	float accelerometer2_m_s2[3];
	uint32_t accelerometer2_errcount;
	float accelerometer2_temp;
	float magnetometer2_ga[3];
	uint32_t magnetometer2_errcount;
	float magnetometer2_temp;
	float baro_pres_mbar;
	float baro_alt_meter;
	float baro_temp_celcius;
	float baro1_pres_mbar;
	float baro1_alt_meter;
	float baro1_temp_celcius;
	float adc_voltage_v[10];
	float mcu_temp_celcius;
	float differential_pressure_pa;
	float differential_pressure_filtered_pa;
	float differential_pressure1_pa;
	float differential_pressure1_filtered_pa;
	int16_t gyro_raw[3];
	int16_t accelerometer_raw[3];
	int16_t accelerometer_mode;
	int16_t magnetometer_raw[3];
	int16_t magnetometer_mode;
	int16_t gyro1_raw[3];
	int16_t accelerometer1_raw[3];
	int16_t magnetometer1_raw[3];
	int16_t gyro2_raw[3];
	int16_t accelerometer2_raw[3];
	int16_t magnetometer2_raw[3];
	uint16_t adc_mapping[10];
	uint8_t _padding0[6]; // required for logger

#ifdef __cplusplus
	static const int32_t MAGNETOMETER_MODE_NORMAL = 0;
	static const int32_t MAGNETOMETER_MODE_POSITIVE_BIAS = 1;
	static const int32_t MAGNETOMETER_MODE_NEGATIVE_BIAS = 2;

#endif
};

/* register this as object request broker structure */
ORB_DECLARE(hil_sensor);

