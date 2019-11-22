package es.uah.aut.srg.gss.xtext.xml;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import es.uah.aut.srg.gss.common.GSSModelFile;

public class XMLGeneratorUtil {

	public static void convertReferences(EObject model) {
		
		List<Resource> doneResources = new ArrayList<Resource>();
		
		for (TreeIterator<EObject> it = model.eAllContents(); it.hasNext(); ) {
			EObject eObject = it.next();
			
			for (Iterator<EObject> featureIterator =  eObject.eCrossReferences().iterator(); featureIterator.hasNext(); )
			{
			    EObject referredObject = featureIterator.next();
			    Resource resource = referredObject.eResource();

			    // If the object is in the same resource, continue to the next one
			    // NOTE: This is not supposed to happen, since you should not be able to define
			    // more than one object on the same file
			    
			    if (resource == model.eResource()) {
			    	continue;
			    }
			    
			    // Check if the fragment of the container resource is of type platform
			    // If is not, then we do not know how to proceed => continue
			    if (resource.getURI().isPlatformResource() == false) {
			    	continue;
			    }
			    
			    if (doneResources.contains(resource)) {
			    	continue;
			    }
			    
			    doneResources.add(resource);
			    
			    EObject root = EcoreUtil.getRootContainer(referredObject);
			    
			    if ((root instanceof GSSModelFile) == true) {
			    	resource.getContents().add(((GSSModelFile)root).getElement());
			    } else if ((root instanceof GSSModelFile) == true) {
			    	resource.getContents().add(((GSSModelFile)root).getElement());
			    } else {
			    	continue;
			    }
   
			    EcoreUtil.delete(root);
			    
			    URI newURI = referredObject.eResource().getURI().trimFileExtension().appendFileExtension("xmi");
			    referredObject.eResource().setURI(newURI);
			    
			}

		}
		
	}

	
}
