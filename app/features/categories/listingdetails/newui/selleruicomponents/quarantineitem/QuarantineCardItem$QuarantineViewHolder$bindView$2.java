package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem;

import aa.yk;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardItem;
import com.forsale.app.features.more.WebActivity;
import com.forsale.app.features.more.WebType;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QuarantineCardItem.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardItem$QuarantineViewHolder$bindView$2", f = "QuarantineCardItem.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class QuarantineCardItem$QuarantineViewHolder$bindView$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27909a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ QuarantineCardItem f27910b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ QuarantineCardItem.QuarantineViewHolder f27911c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QuarantineCardItem.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardItem$QuarantineViewHolder$bindView$2$1", f = "QuarantineCardItem.kt", l = {40}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardItem$QuarantineViewHolder$bindView$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27912a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ QuarantineCardItem f27913b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ QuarantineCardItem.QuarantineViewHolder f27914c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: QuarantineCardItem.kt */
        @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardItem$QuarantineViewHolder$bindView$2$1$1", f = "QuarantineCardItem.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardItem$QuarantineViewHolder$bindView$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03031 extends SuspendLambda implements p<String, a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f27915a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f27916b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ QuarantineCardItem.QuarantineViewHolder f27917c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03031(QuarantineCardItem.QuarantineViewHolder quarantineViewHolder, a<? super C03031> aVar) {
                super(2, aVar);
                this.f27917c = quarantineViewHolder;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(String str, a<? super wz.p> aVar) {
                return ((C03031) create(str, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final a<wz.p> create(Object obj, a<?> aVar) {
                C03031 c03031 = new C03031(this.f27917c, aVar);
                c03031.f27916b = obj;
                return c03031;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                yk ykVar;
                b.f();
                if (this.f27915a == 0) {
                    f.b(obj);
                    String str = (String) this.f27916b;
                    if (str != null) {
                        ykVar = this.f27917c.f27908a;
                        Context context = ykVar.getRoot().getContext();
                        if (context != null) {
                            WebActivity.a.d(WebActivity.I, context, WebType.TERMS_CONDITIONS, str, null, 0, null, 28, null);
                        }
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(QuarantineCardItem quarantineCardItem, QuarantineCardItem.QuarantineViewHolder quarantineViewHolder, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27913b = quarantineCardItem;
            this.f27914c = quarantineViewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f27913b, this.f27914c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f27912a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SharedFlow<String> f12 = this.f27913b.w().f();
                C03031 c03031 = new C03031(this.f27914c, null);
                this.f27912a = 1;
                if (FlowKt.collectLatest(f12, c03031, this) == f11) {
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
    public QuarantineCardItem$QuarantineViewHolder$bindView$2(QuarantineCardItem quarantineCardItem, QuarantineCardItem.QuarantineViewHolder quarantineViewHolder, a<? super QuarantineCardItem$QuarantineViewHolder$bindView$2> aVar) {
        super(2, aVar);
        this.f27910b = quarantineCardItem;
        this.f27911c = quarantineViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new QuarantineCardItem$QuarantineViewHolder$bindView$2(this.f27910b, this.f27911c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27909a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s v11 = this.f27910b.v();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27910b, this.f27911c, null);
            this.f27909a = 1;
            if (RepeatOnLifecycleKt.b(v11, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((QuarantineCardItem$QuarantineViewHolder$bindView$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
