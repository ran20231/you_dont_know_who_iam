package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.utils.TypeExtensionsKt;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import t9.y0;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoRepostViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost.AutoRepostViewModel$loadRepostDate$1$1", f = "AutoRepostViewModel.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AutoRepostViewModel$loadRepostDate$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27727a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AutoRepostViewModel f27728b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f27729c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoRepostViewModel$loadRepostDate$1$1(AutoRepostViewModel autoRepostViewModel, ListingItemDetails listingItemDetails, a<? super AutoRepostViewModel$loadRepostDate$1$1> aVar) {
        super(2, aVar);
        this.f27728b = autoRepostViewModel;
        this.f27729c = listingItemDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new AutoRepostViewModel$loadRepostDate$1$1(this.f27728b, this.f27729c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        RegionsRepository regionsRepository;
        com.forsale.app.features.categories.listingdetails.a aVar;
        ApplicationResourcesRepository applicationResourcesRepository;
        f11 = b.f();
        int i11 = this.f27727a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            regionsRepository = this.f27728b.f27719d;
            Integer d11 = kotlin.coroutines.jvm.internal.a.d(this.f27729c.getRegId());
            this.f27727a = 1;
            obj = regionsRepository.getRegion(d11, this);
            if (obj == f11) {
                return f11;
            }
        }
        ListingItemDetails listingItemDetails = this.f27729c;
        AutoRepostViewModel autoRepostViewModel = this.f27728b;
        RegionEntity regionEntity = (RegionEntity) obj;
        String dateExpired = listingItemDetails.getDateExpired();
        if (dateExpired != null) {
            aVar = TypeExtensionsKt.t(dateExpired, "yyyy-MM-dd HH:mm:ss");
        } else {
            aVar = null;
        }
        if (aVar != null) {
            b0<com.forsale.app.features.categories.listingdetails.a> h11 = autoRepostViewModel.h();
            if (h11 != null) {
                h11.postValue(aVar);
            }
            b0<String> i12 = autoRepostViewModel.i();
            applicationResourcesRepository = autoRepostViewModel.f27720e;
            i12.postValue(applicationResourcesRepository.getString(y0.I6, kotlin.coroutines.jvm.internal.a.d(aVar.a()), kotlin.coroutines.jvm.internal.a.d(aVar.b()), kotlin.coroutines.jvm.internal.a.d(aVar.c())));
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((AutoRepostViewModel$loadRepostDate$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
