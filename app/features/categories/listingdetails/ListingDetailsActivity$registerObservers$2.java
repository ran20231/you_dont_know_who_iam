package com.forsale.app.features.categories.listingdetails;

import android.content.Context;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$registerObservers$2", f = "ListingDetailsActivity.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsActivity$registerObservers$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25129a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingDetailsActivity f25130b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListingDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<ShareText> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ListingDetailsActivity f25131a;

        a(ListingDetailsActivity listingDetailsActivity) {
            this.f25131a = listingDetailsActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(ShareText shareText, zz.a<? super wz.p> aVar) {
            Context context;
            if (shareText != null && (context = ListingDetailsActivity.J0(this.f25131a).getRoot().getContext()) != null) {
                ContextExtensionsKt.P(context, shareText.c(), shareText.a());
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsActivity$registerObservers$2(ListingDetailsActivity listingDetailsActivity, zz.a<? super ListingDetailsActivity$registerObservers$2> aVar) {
        super(2, aVar);
        this.f25130b = listingDetailsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsActivity$registerObservers$2(this.f25130b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25129a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            OneShotEventHandler<ShareText> m12 = this.f25130b.x0().m1();
            a aVar = new a(this.f25130b);
            this.f25129a = 1;
            if (m12.e(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsActivity$registerObservers$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
