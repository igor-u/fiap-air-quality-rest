package br.com.fiap.airquality.model.device.impl;

import br.com.fiap.airquality.model.device.Device;
import jakarta.persistence.*;

@Entity(name = "air_quality_sensors")
@Inheritance(strategy = InheritanceType.JOINED)
public class AirQualitySensor extends Device {

    public Double aqi;

    @Column(name = "temperature_celsius")
    private Double temperatureCelsius;

    @Column(name = "humidity_percentage")
    private Double humidityPercentage;

    @Column(name = "ECO2_PPM")
    private Double eco2Ppm;

    @Column(name = "TVOC_PPB")
    private Double tvocPpb;

}