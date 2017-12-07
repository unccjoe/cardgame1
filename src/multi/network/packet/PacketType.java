/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi.network.packet;

/**
 *
 * @author Knifesurge
 * @since 2017-12-06
 */
public enum PacketType {
    
    INVALID(-1), CONNECT(00), DISCONNECT(01);
    
    /**
     * ID of the Packet
     */
    int id;
    
    PacketType(int id)
    {
        this.id = id;
    }
    
    /**
     * Returns this PacketType's unique ID
     * @return ID of this Packet
     */
    public int getID()
    {
        return id;
    }
    
}