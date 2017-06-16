package innerclasses;
import innerclasses.controller.*;
/**温室控制器
 * Created by Administrator on 2017/6/15.
 */
public class GreenhouseControls extends Controller
{
    private boolean light=false;
    public class LightOn extends Event
    {
        public LightOn(long dayTime)
        {
            super(dayTime);
        }
        @Override
        public void action()
        {
            light=true;
        }
        @Override
        public String toString()
        {
            return "light is on";
        }
    }
    public class LightOff extends Event
    {
        public LightOff(long dayTime)
        {
            super(dayTime);
        }
        @Override
        public void action()
        {
            light=false;
        }
        @Override
        public String toString()
        {
            return "light is Off";
        }
    }
    private boolean water=false;
    public class WaterOn extends Event
    {
        public WaterOn(long dayTime)
        {
            super(dayTime);
        }
        @Override
        public void action()
        {
            water=true;
        }
        @Override
        public String toString()
        {
            return "Water is on";
        }
    }
    public class WaterOff extends Event
    {
        public WaterOff(long dayTime)
        {
            super(dayTime);
        }
        @Override
        public void action()
        {
            water=false;
        }
        @Override
        public String toString()
        {
            return "Water is Off";
        }
    }
    private String thermostat="Day";
    public class ThermostatNight extends Event
    {//恒温器
        public ThermostatNight(long dayTime)
        {
            super(dayTime);
        }
        public void action()
        {
            thermostat="night";
        }
        @Override
        public String toString()
        {
            return "thermostat on night setting";
        }
    }
    public class ThermostatDay extends Event
    {
        public ThermostatDay(long dayTime)
        {
            super(dayTime);
        }
        public void action()
        {
            thermostat="Day";
        }
        @Override
        public String toString()
        {
            return "thermostat on Day setting";
        }
    }
    public class Bell extends Event
    {
        public Bell(long dayTime)
        {
            super(dayTime);
        }
        public void action()
        {
            addEvent(new Bell(dayTime));
        }
        @Override
        public String toString()
        {
            return "Bell";
        }
    }
    public class restart extends Event
    {
        private Event[] eventList;
        public restart(long dayTime, Event[] eventList)
        {
            super(dayTime);
            this.eventList = eventList;
            for(Event e:eventList)addEvent(e);
        }
        @Override
        public void action()
        {
            for(Event e:eventList)
            {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        @Override
        public String toString()
        {
            return "restarting system";
        }
    }
    public static class Terminate extends Event
    {
        public Terminate(long dayTime)
        {
            super(dayTime);
        }
        @Override
        public void action()
        {
            System.exit(0);
        }
        @Override
        public String toString()
        {
            return "terminating";
        }
    }
    public class FanOpen extends Event
    {//风扇
        public FanOpen(long dayTime)
        {
            super(dayTime);
        }
        @Override
        public void action()
        {
            System.out.println("fan open");
        }
    }
    public class FanOff extends Event
    {
        public FanOff(long dayTime)
        {
            super(dayTime);
        }
        @Override
        public void action()
        {
            System.out.println("fan off");
        }
    }
}

