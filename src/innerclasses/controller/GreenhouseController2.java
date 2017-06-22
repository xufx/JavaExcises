package innerclasses.controller;
import innerclasses.GreenhouseControls;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/**
 * Created by Administrator on 2017/6/15.
 */
public class GreenhouseController2
{
    public static void main(String[] args)
    {
        GreenhouseControls gc=new GreenhouseControls();
        List<Event>events= Arrays.asList
                (
                        gc.new Bell(900),
                        gc.new ThermostatNight(0),//创建子类ThermostatNigh对象并初始化
                        gc.new LightOn(200),
                        gc.new LightOff(400),
                        gc.new WaterOn(600),
                        gc.new WaterOff(800),
                        gc.new ThermostatDay(1400),
                        gc.new FanOpen(1600),
                        gc.new FanOff(1800)
        );
        ListIterator<Event> it=events.listIterator();
        while (it.hasNext())
        {
            gc.run();
        }
    }
}
