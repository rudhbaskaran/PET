/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.signal;

/**
 *
 * @author waziz
 */
public interface SignalListener {
    void treat(final Signal s);
    void treat(final Signal s, final SignalPackage o);
}
