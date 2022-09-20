package org.example.remotes;

import org.example.devices.Device;

// Puedes extender clases de la jerarquía de abstracción
// independientemente de las clases de dispositivo.
public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}