package br.com.fiap.airquality.model.device;

import jakarta.persistence.*;

@Entity(name = "devices")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqAirMonitoringDeviceId")
    @SequenceGenerator(name = "seqAirMonitoringDeviceId", sequenceName = "SEQ_AIR_MONITORING_DEVICE_ID", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    private String model;

    @Enumerated(EnumType.STRING)
    private DeviceStatus status;

}