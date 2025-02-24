class SmartHome{
    public final static class device{
        public final int deviceID;
        public final String deviceName;
        public final static int MAX_DEVICES=50;
        public device(int deviceID,String deviceName){
            this.deviceID=deviceID;
            this.deviceName=deviceName;
        }
        public final String getDetails(){
        return "deviceID:"+deviceID+"deviceName:"+deviceName;
            
        }
    }
        public final static class Configuration{
            public static final int MAX_POWER_LIMIT=3000;
        }
        public abstract static class Devicetype{
            public abstract String getDeviceCategory();
            }
            public static class LightDevice extends Devicetype{
                public String getDeviceCategory(){
                    return "LightDevice";
                }}
            public static class FanDevice extends Devicetype{
                public String getDeviceCategory(){
                    return "Fan Device";
                }
            }
        }
        public class Smarthome{
            public static void main(String[] args){
                System.out.println("MAX_POWER_LIMIT:"+SmartHome.Configuration.MAX_POWER_LIMIT);
                SmartHome.LightDevice lobj=new SmartHome.LightDevice();
                SmartHome.FanDevice fobj=new SmartHome.FanDevice();
                System.out.println("Fan Device Category:"+fobj.getDeviceCategory());
                System.out.println("LightDevice Category:"+lobj.getDeviceCategory());
            }
        }
        
