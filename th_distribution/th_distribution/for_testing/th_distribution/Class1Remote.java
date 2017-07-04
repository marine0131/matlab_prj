/*
 * MATLAB Compiler: 6.3 (R2016b)
 * Date: Tue Jul  4 15:25:58 2017
 * Arguments: "-B" "macro_default" "-W" "java:th_distribution,Class1" "-T" "link:lib" 
 * "-d" "/home/whj/gitrepo/matlab_prj/th_distribution/th_distribution/for_testing" 
 * "class{Class1:/home/whj/gitrepo/matlab_prj/th_distribution/th_distribution.m}" 
 */

package th_distribution;

import com.mathworks.toolbox.javabuilder.pooling.Poolable;
import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * The <code>Class1Remote</code> class provides a Java RMI-compliant interface to the 
 * M-functions from the files:
 * <pre>
 *  /home/whj/gitrepo/matlab_prj/th_distribution/th_distribution.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a <code>Class1Remote</code> 
 * instance when it is no longer needed to ensure that native resources allocated by this 
 * class are properly freed, and the server-side proxy is unexported.  (Failure to call 
 * dispose may result in server-side threads not being properly shut down, which often 
 * appears as a hang.)  
 *
 * This interface is designed to be used together with 
 * <code>com.mathworks.toolbox.javabuilder.remoting.RemoteProxy</code> to automatically 
 * generate RMI server proxy objects for instances of th_distribution.Class1.
 */
public interface Class1Remote extends Poolable
{
    /**
     * Provides the standard interface for calling the <code>th_distribution</code> 
     * M-function with 7 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * % img=imread('company_map.pgm');
     * % min_x = 1;
     * % min_y = 1;
     * % [max_x,max_y,n] = size(img);
     * % 
     * % figure;
     * % imagesc([min_x max_x],[min_y max_y],img);
     * % 
     * % hold on;
     * % 
     * %底图设置透明度
     * % im_src = 'jifang.png';
     * % x=[50,100,200,300,1000];
     * % y=[50,100,200,300,1000];
     * % z=[10,20,22,24,30];
     * % temp ='temp.png'
     * % limit = [10 50]
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] th_distribution(int nargout, Object... rhs) throws RemoteException;
  
    /** Frees native resources associated with the remote server object */
    void dispose() throws RemoteException;
}
