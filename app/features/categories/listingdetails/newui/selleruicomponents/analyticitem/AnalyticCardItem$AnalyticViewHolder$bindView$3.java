package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem;

import aa.mh;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.ownerlistingchats.ListingChatsActivity;
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
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem$AnalyticViewHolder$bindView$3", f = "AnalyticCardItem.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AnalyticCardItem$AnalyticViewHolder$bindView$3 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27666a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AnalyticCardItem f27667b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AnalyticCardItem.AnalyticViewHolder f27668c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnalyticCardItem.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem$AnalyticViewHolder$bindView$3$1", f = "AnalyticCardItem.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem$AnalyticViewHolder$bindView$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27669a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AnalyticCardItem f27670b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AnalyticCardItem.AnalyticViewHolder f27671c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AnalyticCardItem.kt */
        @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem$AnalyticViewHolder$bindView$3$1$1", f = "AnalyticCardItem.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem$AnalyticViewHolder$bindView$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02971 extends SuspendLambda implements p<Integer, a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f27672a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ int f27673b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AnalyticCardItem.AnalyticViewHolder f27674c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02971(AnalyticCardItem.AnalyticViewHolder analyticViewHolder, a<? super C02971> aVar) {
                super(2, aVar);
                this.f27674c = analyticViewHolder;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final a<wz.p> create(Object obj, a<?> aVar) {
                C02971 c02971 = new C02971(this.f27674c, aVar);
                c02971.f27673b = ((Number) obj).intValue();
                return c02971;
            }

            public final Object invoke(int i11, a<? super wz.p> aVar) {
                return ((C02971) create(Integer.valueOf(i11), aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                mh mhVar;
                b.f();
                if (this.f27672a == 0) {
                    f.b(obj);
                    int i11 = this.f27673b;
                    ListingChatsActivity.a aVar = ListingChatsActivity.f27843z;
                    mhVar = this.f27674c.f27656a;
                    Context context = mhVar.getRoot().getContext();
                    o.h(context, "getContext(...)");
                    ListingChatsActivity.a.b(aVar, context, kotlin.coroutines.jvm.internal.a.d(i11), null, 2, null);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ Object invoke(Integer num, a<? super wz.p> aVar) {
                return invoke(num.intValue(), aVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnalyticCardItem analyticCardItem, AnalyticCardItem.AnalyticViewHolder analyticViewHolder, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27670b = analyticCardItem;
            this.f27671c = analyticViewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f27670b, this.f27671c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f27669a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SharedFlow<Integer> j11 = this.f27670b.f27652f.j();
                C02971 c02971 = new C02971(this.f27671c, null);
                this.f27669a = 1;
                if (FlowKt.collectLatest(j11, c02971, this) == f11) {
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
    public AnalyticCardItem$AnalyticViewHolder$bindView$3(AnalyticCardItem analyticCardItem, AnalyticCardItem.AnalyticViewHolder analyticViewHolder, a<? super AnalyticCardItem$AnalyticViewHolder$bindView$3> aVar) {
        super(2, aVar);
        this.f27667b = analyticCardItem;
        this.f27668c = analyticViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new AnalyticCardItem$AnalyticViewHolder$bindView$3(this.f27667b, this.f27668c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27666a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s sVar = this.f27667b.f27653g;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27667b, this.f27668c, null);
            this.f27666a = 1;
            if (RepeatOnLifecycleKt.b(sVar, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((AnalyticCardItem$AnalyticViewHolder$bindView$3) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
