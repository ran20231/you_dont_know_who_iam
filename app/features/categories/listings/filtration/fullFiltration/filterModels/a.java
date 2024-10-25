package com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels;

import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterViewType;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.forsale.app.utils.analytics.listingfiltration.FilterPlaces;
import kotlin.jvm.internal.o;
/* compiled from: FilterScreenTypes.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: FilterScreenTypes.kt */
    /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0323a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29250a;

        static {
            int[] iArr = new int[ListingsResponse.UISettings.FiltrationSetting.ViewType.values().length];
            try {
                iArr[ListingsResponse.UISettings.FiltrationSetting.ViewType.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListingsResponse.UISettings.FiltrationSetting.ViewType.RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29250a = iArr;
        }
    }

    public static final FilterScreenTypes a(ListingsResponse.UISettings.FiltrationSetting setting, FilterViewModel<?, ?, ?> filterViewModel, boolean z11) {
        boolean z12;
        FilterPlaces filterPlaces;
        o.i(setting, "setting");
        o.i(filterViewModel, "filterViewModel");
        if (c(setting, z11)) {
            boolean z13 = true;
            if (setting.getViewType() == ListingsResponse.UISettings.FiltrationSetting.ViewType.FULL_SCREEN_WITH_SEARCH) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (setting.getFilterType() != ListingsResponse.UISettings.FiltrationSetting.FilterType.SUB_CATEGORY) {
                z13 = false;
            }
            FilterViewType b11 = b(setting, filterViewModel instanceof BooleanAttributeFilterViewModel);
            if (z11) {
                filterPlaces = FilterPlaces.ALL_FILTERS;
            } else {
                filterPlaces = FilterPlaces.EXPOSED_FILTERS;
            }
            return new FilterScreenTypes.NewScreen(z12, z13, b11, filterPlaces);
        }
        return new FilterScreenTypes.InPlace(b(setting, filterViewModel instanceof BooleanAttributeFilterViewModel));
    }

    private static final FilterViewType b(ListingsResponse.UISettings.FiltrationSetting filtrationSetting, boolean z11) {
        int i11;
        FilterViewType filterViewType;
        if (z11) {
            return FilterViewType.Bool.f29239a;
        }
        ListingsResponse.UISettings.FiltrationSetting.ViewType viewType = filtrationSetting.getViewType();
        if (viewType == null) {
            i11 = -1;
        } else {
            i11 = C0323a.f29250a[viewType.ordinal()];
        }
        boolean z12 = false;
        if (i11 != 1) {
            if (i11 != 2) {
                if (filtrationSetting.getSelectionType() == ListingsResponse.UISettings.FiltrationSetting.SelectionType.SINGLE) {
                    z12 = true;
                }
                return new FilterViewType.FilterSelectionViewType.Vertical(z12);
            }
            if (filtrationSetting.getFilterType() == ListingsResponse.UISettings.FiltrationSetting.FilterType.PRICE) {
                filterViewType = FilterViewType.Range.Price.f29246a;
            } else {
                filterViewType = FilterViewType.Range.RangedAttribute.f29248a;
            }
            return filterViewType;
        }
        if (filtrationSetting.getSelectionType() == ListingsResponse.UISettings.FiltrationSetting.SelectionType.SINGLE) {
            z12 = true;
        }
        return new FilterViewType.FilterSelectionViewType.Horizontal(z12);
    }

    private static final boolean c(ListingsResponse.UISettings.FiltrationSetting filtrationSetting, boolean z11) {
        if (z11 && filtrationSetting.getFilterType() != ListingsResponse.UISettings.FiltrationSetting.FilterType.LOCATION && filtrationSetting.getViewType() != ListingsResponse.UISettings.FiltrationSetting.ViewType.FULL_SCREEN_WITH_SEARCH && filtrationSetting.getViewType() != ListingsResponse.UISettings.FiltrationSetting.ViewType.FULL_SCREEN) {
            return false;
        }
        return true;
    }
}
