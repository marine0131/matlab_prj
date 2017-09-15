/*
 * MATLAB Compiler: 6.3 (R2016b)
 * Date: Fri Sep 15 13:17:22 2017
 * Arguments: "-B" "macro_default" "-W" "java:th_distribution,Class1" "-T" "link:lib" 
 * "-d" "/home/whj/gitrepo/matlab_prj/th_distribution/th_distribution/for_testing" 
 * "class{Class1:/home/whj/gitrepo/matlab_prj/th_distribution/th_distribution.m}" 
 */

package th_distribution;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;
import java.util.*;

/**
 * The <code>Class1</code> class provides a Java interface to the M-functions
 * from the files:
 * <pre>
 *  /home/whj/gitrepo/matlab_prj/th_distribution/th_distribution.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a <code>Class1</code> instance 
 * when it is no longer needed to ensure that native resources allocated by this class 
 * are properly freed.
 * @version 0.0
 */
public class Class1 extends MWComponentInstance<Class1>
{
    /**
     * Tracks all instances of this class to ensure their dispose method is
     * called on shutdown.
     */
    private static final Set<Disposable> sInstances = new HashSet<Disposable>();

    /**
     * Maintains information used in calling the <code>th_distribution</code> M-function.
     */
    private static final MWFunctionSignature sTh_distributionSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "th_distribution",
                                /* max inputs = */ 7,
                                /* has varargin = */ false);

    /**
     * Shared initialization implementation - private
     */
    private Class1 (final MWMCR mcr) throws MWException
    {
        super(mcr);
        // add this to sInstances
        synchronized(Class1.class) {
            sInstances.add(this);
        }
    }

    /**
     * Constructs a new instance of the <code>Class1</code> class.
     */
    public Class1() throws MWException
    {
        this(Th_distributionMCRFactory.newInstance());
    }
    
    private static MWComponentOptions getPathToComponentOptions(String path)
    {
        MWComponentOptions options = new MWComponentOptions(new MWCtfExtractLocation(path),
                                                            new MWCtfDirectorySource(path));
        return options;
    }
    
    /**
     * @deprecated Please use the constructor {@link #Class1(MWComponentOptions componentOptions)}.
     * The <code>com.mathworks.toolbox.javabuilder.MWComponentOptions</code> class provides API to set the
     * path to the component.
     * @param pathToComponent Path to component directory.
     */
    public Class1(String pathToComponent) throws MWException
    {
        this(Th_distributionMCRFactory.newInstance(getPathToComponentOptions(pathToComponent)));
    }
    
    /**
     * Constructs a new instance of the <code>Class1</code> class. Use this constructor 
     * to specify the options required to instantiate this component.  The options will 
     * be specific to the instance of this component being created.
     * @param componentOptions Options specific to the component.
     */
    public Class1(MWComponentOptions componentOptions) throws MWException
    {
        this(Th_distributionMCRFactory.newInstance(componentOptions));
    }
    
    /** Frees native resources associated with this object */
    public void dispose()
    {
        try {
            super.dispose();
        } finally {
            synchronized(Class1.class) {
                sInstances.remove(this);
            }
        }
    }
  
    /**
     * Invokes the first m-function specified by MCC, with any arguments given on
     * the command line, and prints the result.
     */
    public static void main (String[] args)
    {
        try {
            MWMCR mcr = Th_distributionMCRFactory.newInstance();
            mcr.runMain( sTh_distributionSignature, args);
            mcr.dispose();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    /**
     * Calls dispose method for each outstanding instance of this class.
     */
    public static void disposeAllInstances()
    {
        synchronized(Class1.class) {
            for (Disposable i : sInstances) i.dispose();
            sInstances.clear();
        }
    }

    /**
     * Provides the interface for calling the <code>th_distribution</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void th_distribution(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sTh_distributionSignature);
    }

    /**
     * Provides the interface for calling the <code>th_distribution</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void th_distribution(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sTh_distributionSignature);
    }

    /**
     * Provides the standard interface for calling the <code>th_distribution</code>
     * M-function with 7 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] th_distribution(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sTh_distributionSignature), 
                    sTh_distributionSignature);
        return lhs;
    }
}
