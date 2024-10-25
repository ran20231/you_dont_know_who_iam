package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.locationitem;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.repositories.LocationRepository;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingMapViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.locationitem.ListingMapViewModel$refreshLocationString$1", f = "ListingMapViewModel.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingMapViewModel$refreshLocationString$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27517a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingMapViewModel f27518b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ double f27519c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ double f27520d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingMapViewModel$refreshLocationString$1(ListingMapViewModel listingMapViewModel, double d11, double d12, zz.a<? super ListingMapViewModel$refreshLocationString$1> aVar) {
        super(2, aVar);
        this.f27518b = listingMapViewModel;
        this.f27519c = d11;
        this.f27520d = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingMapViewModel$refreshLocationString$1(this.f27518b, this.f27519c, this.f27520d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        LocationRepository locationRepository;
        b0 b0Var;
        f11 = b.f();
        int i11 = this.f27517a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            locationRepository = this.f27518b.f27510b;
            double d11 = this.f27519c;
            double d12 = this.f27520d;
            this.f27517a = 1;
            obj = locationRepository.retrieveAddress(d11, d12, this);
            if (obj == f11) {
                return f11;
            }
        }
        String str = (String) obj;
        if (str != null) {
            b0Var = this.f27518b.f27514f;
            b0Var.postValue(str);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingMapViewModel$refreshLocationString$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
