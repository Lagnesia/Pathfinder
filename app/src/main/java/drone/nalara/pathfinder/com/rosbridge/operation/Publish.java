/**
 * Copyright (c) 2014 Jilk Systems, Inc.
 * 
 * This file is part of the Java ROSBridge Client.
 *
 * The Java ROSBridge Client is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The Java ROSBridge Client is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with the Java ROSBridge Client.  If not, see http://www.gnu.org/licenses/.
 * 
 */
package drone.nalara.pathfinder.com.rosbridge.operation;

import drone.nalara.pathfinder.com.message.Message;
import drone.nalara.pathfinder.com.message.MessageType;
import drone.nalara.pathfinder.com.rosbridge.indication.Indicated;
import drone.nalara.pathfinder.com.rosbridge.indication.Indicator;

@MessageType(string = "publish")
public class Publish extends Operation {
    
    @Indicator public String topic;
    @Indicated
    public Message msg;
    
    public Publish() {}
    
    public Publish(String topic, Message msg) {
        this.topic = topic;
        this.msg = msg;
    }
}
