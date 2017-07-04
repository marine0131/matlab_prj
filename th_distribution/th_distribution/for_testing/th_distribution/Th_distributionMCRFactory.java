/*
 * MATLAB Compiler: 6.3 (R2016b)
 * Date: Tue Jul  4 15:25:58 2017
 * Arguments: "-B" "macro_default" "-W" "java:th_distribution,Class1" "-T" "link:lib" 
 * "-d" "/home/whj/gitrepo/matlab_prj/th_distribution/th_distribution/for_testing" 
 * "class{Class1:/home/whj/gitrepo/matlab_prj/th_distribution/th_distribution.m}" 
 */

package th_distribution;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class Th_distributionMCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "th_distribut_25C2EB773054F41DBE21F31E847E61A9";
    
    /** Component name */
    private static final String sComponentName = "th_distribution";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(Th_distributionMCRFactory.class)
        );
    
    
    private Th_distributionMCRFactory()
    {
        // Never called.
    }
    
    public static MWMCR newInstance(MWComponentOptions componentOptions) throws MWException
    {
        if (null == componentOptions.getCtfSource()) {
            componentOptions = new MWComponentOptions(componentOptions);
            componentOptions.setCtfSource(sDefaultComponentOptions.getCtfSource());
        }
        return MWMCR.newInstance(
            componentOptions, 
            Th_distributionMCRFactory.class, 
            sComponentName, 
            sComponentId,
            new int[]{9,1,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
