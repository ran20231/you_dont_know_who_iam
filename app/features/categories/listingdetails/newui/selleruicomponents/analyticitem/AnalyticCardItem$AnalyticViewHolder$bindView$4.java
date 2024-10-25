package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem;

import aa.mh;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem;
import com.forsale.app.ui.bottomsheets.updateapp.UpdateAppAlertBottomSheet;
import com.forsale.app.utils.ContextExtensionsKt;
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
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem$AnalyticViewHolder$bindView$4", f = "AnalyticCardItem.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AnalyticCardItem$AnalyticViewHolder$bindView$4 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27675a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AnalyticCardItem f27676b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AnalyticCardItem.AnalyticViewHolder f27677c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnalyticCardItem.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem$AnalyticViewHolder$bindView$4$1", f = "AnalyticCardItem.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem$AnalyticViewHolder$bindView$4$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27678a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AnalyticCardItem f27679b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AnalyticCardItem.AnalyticViewHolder f27680c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AnalyticCardItem.kt */
        @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem$AnalyticViewHolder$bindView$4$1$1", f = "AnalyticCardItem.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem$AnalyticViewHolder$bindView$4$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02981 extends SuspendLambda implements p<wz.p, a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f27681a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AnalyticCardItem.AnalyticViewHolder f27682b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02981(AnalyticCardItem.AnalyticViewHolder analyticViewHolder, a<? super C02981> aVar) {
                super(2, aVar);
                this.f27682b = analyticViewHolder;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(wz.p pVar, a<? super wz.p> aVar) {
                return ((C02981) create(pVar, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final a<wz.p> create(Object obj, a<?> aVar) {
                return new C02981(this.f27682b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                mh mhVar;
                b.f();
                if (this.f27681a == 0) {
                    f.b(obj);
                    mhVar = this.f27682b.f27656a;
                    androidx.appcompat.app.d l11 = ContextExtensionsKt.l(mhVar.getRoot().getContext());
                    if (l11 != null) {
                        UpdateAppAlertBottomSheet updateAppAlertBottomSheet = new UpdateAppAlertBottomSheet(null, 1, null);
                        FragmentManager supportFragmentManager = l11.getSupportFragmentManager();
                        o.h(supportFragmentManager, "getSupportFragmentManager(...)");
                        updateAppAlertBottomSheet.a(supportFragmentManager, l11);
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnalyticCardItem analyticCardItem, AnalyticCardItem.AnalyticViewHolder analyticViewHolder, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27679b = analyticCardItem;
            this.f27680c = analyticViewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f27679b, this.f27680c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f27678a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SharedFlow<wz.p> i12 = this.f27679b.f27652f.i();
                C02981 c02981 = new C02981(this.f27680c, null);
                this.f27678a = 1;
                if (FlowKt.collectLatest(i12, c02981, this) == f11) {
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
    public AnalyticCardItem$AnalyticViewHolder$bindView$4(AnalyticCardItem analyticCardItem, AnalyticCardItem.AnalyticViewHolder analyticViewHolder, a<? super AnalyticCardItem$AnalyticViewHolder$bindView$4> aVar) {
        super(2, aVar);
        this.f27676b = analyticCardItem;
        this.f27677c = analyticViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new AnalyticCardItem$AnalyticViewHolder$bindView$4(this.f27676b, this.f27677c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27675a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s sVar = this.f27676b.f27653g;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27676b, this.f27677c, null);
            this.f27675a = 1;
            if (RepeatOnLifecycleKt.b(sVar, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((AnalyticCardItem$AnalyticViewHolder$bindView$4) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
