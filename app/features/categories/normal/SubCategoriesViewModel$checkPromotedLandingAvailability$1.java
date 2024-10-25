package com.forsale.app.features.categories.normal;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel;
import com.forsale.app.utils.gam.ContentUrlType;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import g00.p;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.normal.SubCategoriesViewModel$checkPromotedLandingAvailability$1", f = "SubCategoriesViewModel.kt", l = {160}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SubCategoriesViewModel$checkPromotedLandingAvailability$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31051a;

    /* renamed from: b  reason: collision with root package name */
    int f31052b;

    /* renamed from: c  reason: collision with root package name */
    int f31053c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SubCategoriesViewModel f31054d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoriesViewModel$checkPromotedLandingAvailability$1(SubCategoriesViewModel subCategoriesViewModel, zz.a<? super SubCategoriesViewModel$checkPromotedLandingAvailability$1> aVar) {
        super(2, aVar);
        this.f31054d = subCategoriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SubCategoriesViewModel$checkPromotedLandingAvailability$1(this.f31054d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        SubCategoriesViewModel subCategoriesViewModel;
        GAMRepository gAMRepository;
        int i11;
        wz.p pVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i12 = this.f31053c;
        if (i12 != 0) {
            if (i12 == 1) {
                i11 = this.f31052b;
                subCategoriesViewModel = (SubCategoriesViewModel) this.f31051a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            x10.a.b("PROMOTED: checkPromotedLandingAvailability", new Object[0]);
            PromotedPostItemViewModel.z(this.f31054d.Z0(), null, null, 3, null);
            CategoryEntity categoryEntity = this.f31054d.f31044x0;
            if (categoryEntity != null) {
                int id2 = categoryEntity.getId();
                subCategoriesViewModel = this.f31054d;
                gAMRepository = subCategoriesViewModel.f31039s0;
                fj.a aVar = new fj.a(ContentUrlType.CATEGORY, kotlin.coroutines.jvm.internal.a.d(id2), subCategoriesViewModel.f31044x0.getCategoryTreeNames(), subCategoriesViewModel.f31044x0.getName());
                this.f31051a = subCategoriesViewModel;
                this.f31052b = id2;
                this.f31053c = 1;
                Object buildForInterstitialForCategory = gAMRepository.buildForInterstitialForCategory(id2, aVar, this);
                if (buildForInterstitialForCategory == f11) {
                    return f11;
                }
                i11 = id2;
                obj = buildForInterstitialForCategory;
            }
            return wz.p.f75480a;
        }
        AdManagerAdRequest adManagerAdRequest = (AdManagerAdRequest) obj;
        if (adManagerAdRequest != null) {
            subCategoriesViewModel.b1().i(new Pair<>(kotlin.coroutines.jvm.internal.a.d(i11), adManagerAdRequest));
            pVar = wz.p.f75480a;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            PromotedPostItemViewModel.z(subCategoriesViewModel.Z0(), null, null, 3, null);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SubCategoriesViewModel$checkPromotedLandingAvailability$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
