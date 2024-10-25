package com.forsale.app.features.categories.listingdetails;

import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$registerObservers$5", f = "ListingDetailsActivity.kt", l = {196}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsActivity$registerObservers$5 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25138a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingDetailsActivity f25139b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListingDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ListingDetailsActivity f25140a;

        a(ListingDetailsActivity listingDetailsActivity) {
            this.f25140a = listingDetailsActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            this.f25140a.F1();
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsActivity$registerObservers$5(ListingDetailsActivity listingDetailsActivity, zz.a<? super ListingDetailsActivity$registerObservers$5> aVar) {
        super(2, aVar);
        this.f25139b = listingDetailsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsActivity$registerObservers$5(this.f25139b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25138a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            OneShotEventHandler<wz.p> p12 = this.f25139b.x0().p1();
            a aVar = new a(this.f25139b);
            this.f25138a = 1;
            if (p12.e(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsActivity$registerObservers$5) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
