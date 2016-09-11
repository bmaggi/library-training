package org.eclipse.papyrus.training.library.compare;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.compare.provider.utils.ComposedStyledString;
import org.eclipse.emf.compare.provider.utils.IStyledString.IComposedStyledString;
import org.eclipse.emf.compare.provider.utils.IStyledString.Style;
import org.eclipse.emf.compare.uml2.internal.provider.custom.UMLCompareCustomItemProviderAdapterFactory;
import org.eclipse.emf.compare.uml2.internal.provider.custom.UMLDiffCustomItemProvider;
import org.eclipse.papyrus.training.library.compare.library.BookTheftDiff;

@SuppressWarnings("restriction")
public class BookTheftItemProviderAdapterFactory extends UMLCompareCustomItemProviderAdapterFactory {
	
	@Override
	public Adapter createUMLDiffAdapter() {
		return new UMLDiffCustomItemProvider(this) {
			@Override
			public IComposedStyledString getStyledText(Object object) {
				if (object instanceof BookTheftDiff) {
					BookTheftDiff diff = (BookTheftDiff) object;
					ComposedStyledString styledString = new ComposedStyledString();
					styledString.append(diff.getBorrowerName(), Style.COUNTER_STYLER);
					styledString.append(" stole ", Style.NO_STYLE);
					styledString.append(diff.getBookName(), Style.QUALIFIER_STYLER);
					return styledString;
				}
				return super.getStyledText(object);
			}
			
		};
	}

}
