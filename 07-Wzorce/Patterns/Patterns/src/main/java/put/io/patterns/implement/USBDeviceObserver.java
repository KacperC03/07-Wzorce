package put.io.patterns.implement;

public class USBDeviceObserver implements SystemStateObserver{
    int lastUSBnum=0;
    @Override
    public void update(SystemMonitor monitor) {
        SystemState lastSystemState = monitor.getLastSystemState();
        int currUSBnum=lastSystemState.getUsbDevices();
        if(lastUSBnum!=currUSBnum)
        {
            System.out.println(String.format("USB devices changed from: %d to: %d", lastUSBnum,currUSBnum));
            lastUSBnum=currUSBnum;
        }
    }
}
