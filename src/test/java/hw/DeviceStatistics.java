package hw;

public class DeviceStatistics {
    private String desktopDevice;
    private String mobileDevice;
    private String tabletDevice;
    private double topBrowsers;
    private double resolutions;

    public String getDesktopDevice() {
        return desktopDevice;
    }

    public void setDesktopDevice(String desktopDevice) {
        this.desktopDevice = desktopDevice;
    }

    public String getMobileDevice() {
        return mobileDevice;
    }

    public void setMobileDevice(String mobileDevice) {
        this.mobileDevice = mobileDevice;
    }

    public String getTabletDevice() {
        return tabletDevice;
    }

    public void setTabletDevice(String tabletDevice) {
        this.tabletDevice = tabletDevice;
    }

    public double getTopBrowsers() {
        return topBrowsers;
    }

    public void setTopBrowsers(double topBrowsers) {
        this.topBrowsers = topBrowsers;
    }

    public double getResolutions() {
        return resolutions;
    }

    public void setResolutions(double resolutions) {
        this.resolutions = resolutions;
    }
}
