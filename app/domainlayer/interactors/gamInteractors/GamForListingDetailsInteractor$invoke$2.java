package com.forsale.app.domainlayer.interactors.gamInteractors;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.utils.gam.ContentUrlType;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GamForListingDetailsInteractor.kt */
@d(c = "com.forsale.app.domainlayer.interactors.gamInteractors.GamForListingDetailsInteractor$invoke$2", f = "GamForListingDetailsInteractor.kt", l = {17}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GamForListingDetailsInteractor$invoke$2 extends SuspendLambda implements p<CoroutineScope, a<? super AdManagerAdRequest>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22452a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GamForListingDetailsInteractor f22453b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f22454c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamForListingDetailsInteractor$invoke$2(GamForListingDetailsInteractor gamForListingDetailsInteractor, int i11, a<? super GamForListingDetailsInteractor$invoke$2> aVar) {
        super(2, aVar);
        this.f22453b = gamForListingDetailsInteractor;
        this.f22454c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new GamForListingDetailsInteractor$invoke$2(this.f22453b, this.f22454c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoriesRepositories categoriesRepositories;
        da.a aVar;
        f11 = b.f();
        int i11 = this.f22452a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            categoriesRepositories = this.f22453b.f22451b;
            int i12 = this.f22454c;
            this.f22452a = 1;
            obj = categoriesRepositories.getCategory(i12, this);
            if (obj == f11) {
                return f11;
            }
        }
        CategoryEntity categoryEntity = (CategoryEntity) obj;
        if (categoryEntity != null) {
            aVar = this.f22453b.f22450a;
            return aVar.a(categoryEntity, ContentUrlType.LISTING_DETAILS);
        }
        return null;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super AdManagerAdRequest> aVar) {
        return ((GamForListingDetailsInteractor$invoke$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
