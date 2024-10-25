package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem;

import aa.mh;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem;
import com.forsale.app.features.more.mylistings.AnalyticModel;
import com.forsale.app.features.more.mylistings.MyListingAnalyticsActivity;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnalyticCardItem.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem$AnalyticViewHolder$bindView$2", f = "AnalyticCardItem.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AnalyticCardItem$AnalyticViewHolder$bindView$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27657a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AnalyticCardItem f27658b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AnalyticCardItem.AnalyticViewHolder f27659c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnalyticCardItem.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem$AnalyticViewHolder$bindView$2$1", f = "AnalyticCardItem.kt", l = {36}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem$AnalyticViewHolder$bindView$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27660a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AnalyticCardItem f27661b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AnalyticCardItem.AnalyticViewHolder f27662c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AnalyticCardItem.kt */
        @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem$AnalyticViewHolder$bindView$2$1$1", f = "AnalyticCardItem.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem$AnalyticViewHolder$bindView$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02961 extends SuspendLambda implements p<AnalyticModel, a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f27663a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f27664b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AnalyticCardItem.AnalyticViewHolder f27665c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02961(AnalyticCardItem.AnalyticViewHolder analyticViewHolder, a<? super C02961> aVar) {
                super(2, aVar);
                this.f27665c = analyticViewHolder;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(AnalyticModel analyticModel, a<? super wz.p> aVar) {
                return ((C02961) create(analyticModel, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final a<wz.p> create(Object obj, a<?> aVar) {
                C02961 c02961 = new C02961(this.f27665c, aVar);
                c02961.f27664b = obj;
                return c02961;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                mh mhVar;
                b.f();
                if (this.f27663a == 0) {
                    f.b(obj);
                    MyListingAnalyticsActivity.a aVar = MyListingAnalyticsActivity.f31905z;
                    mhVar = this.f27665c.f27656a;
                    Context context = mhVar.getRoot().getContext();
                    o.h(context, "getContext(...)");
                    aVar.a(context, (AnalyticModel) this.f27664b);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnalyticCardItem analyticCardItem, AnalyticCardItem.AnalyticViewHolder analyticViewHolder, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27661b = analyticCardItem;
            this.f27662c = analyticViewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f27661b, this.f27662c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f27660a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SharedFlow<AnalyticModel> h11 = this.f27661b.f27652f.h();
                C02961 c02961 = new C02961(this.f27662c, null);
                this.f27660a = 1;
                if (FlowKt.collectLatest(h11, c02961, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticCardItem$AnalyticViewHolder$bindView$2(AnalyticCardItem analyticCardItem, AnalyticCardItem.AnalyticViewHolder analyticViewHolder, a<? super AnalyticCardItem$AnalyticViewHolder$bindView$2> aVar) {
        super(2, aVar);
        this.f27658b = analyticCardItem;
        this.f27659c = analyticViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new AnalyticCardItem$AnalyticViewHolder$bindView$2(this.f27658b, this.f27659c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27657a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s sVar = this.f27658b.f27653g;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27658b, this.f27659c, null);
            this.f27657a = 1;
            if (RepeatOnLifecycleKt.b(sVar, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((AnalyticCardItem$AnalyticViewHolder$bindView$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
