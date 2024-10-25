package com.forsale.app.domainlayer.interactors.categoriesinteractors;

import ca.b;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.home.allverticals.AllVerticalsExtentionsKt;
import com.forsale.app.features.categories.home.allverticals.AllVerticalsSectionType;
import com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel;
import com.forsale.app.features.categories.home.allverticals.f;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.p;
/* compiled from: GetBusinessSectionInteractor.kt */
/* loaded from: classes2.dex */
public final class GetBusinessSectionInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final b f22392a;

    /* renamed from: b  reason: collision with root package name */
    private final ca.a f22393b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<f> f22394c;

    /* renamed from: d  reason: collision with root package name */
    private final StateFlow<f> f22395d;

    public GetBusinessSectionInteractor(b getCategoriesByParentIdAndClassificationsInteractor, ca.a getCategoriesByClassificationInteractor) {
        o.i(getCategoriesByParentIdAndClassificationsInteractor, "getCategoriesByParentIdAndClassificationsInteractor");
        o.i(getCategoriesByClassificationInteractor, "getCategoriesByClassificationInteractor");
        this.f22392a = getCategoriesByParentIdAndClassificationsInteractor;
        this.f22393b = getCategoriesByClassificationInteractor;
        MutableStateFlow<f> MutableStateFlow = StateFlowKt.MutableStateFlow(f.f23805c.a(AllVerticalsSectionType.BUSINESS));
        this.f22394c = MutableStateFlow;
        this.f22395d = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AllVerticalsViewModel.e e(List<CategoryEntity> list) {
        boolean z11;
        boolean z12;
        AllVerticalsViewModel.e bVar;
        Object k02;
        Object k03;
        List<CategoryEntity> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (CategoryEntity categoryEntity : list2) {
                z11 = false;
                if (categoryEntity.getClassification() == CategoryEntity.Classification.FOR_SALE) {
                    z12 = true;
                    continue;
                } else {
                    z12 = false;
                    continue;
                }
                if (!z12) {
                    break;
                }
            }
        }
        z11 = true;
        if (list.isEmpty()) {
            return AllVerticalsViewModel.e.a.f23426a;
        }
        List<CategoryEntity> list3 = list;
        if (list3.size() == 1) {
            k02 = CollectionsKt___CollectionsKt.k0(list);
            if (((CategoryEntity) k02).getClassification() == CategoryEntity.Classification.FOR_SALE) {
                k03 = CollectionsKt___CollectionsKt.k0(list);
                bVar = new AllVerticalsViewModel.a.C0258a((CategoryEntity) k03, z11);
                return bVar;
            }
        }
        if (list3.size() < 3) {
            bVar = new AllVerticalsViewModel.a.b(list, 2, z11);
        } else {
            bVar = new AllVerticalsViewModel.a.b(list, 3, z11);
        }
        return bVar;
    }

    public final Object c(int i11, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = AllVerticalsExtentionsKt.a(this.f22394c, new GetBusinessSectionInteractor$fetchBusinessCategories$2(this, i11, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final StateFlow<f> d() {
        return this.f22395d;
    }
}
