package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem;

import aa.yk;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardItem;
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
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardItem$QuarantineViewHolder$bindView$3", f = "QuarantineCardItem.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class QuarantineCardItem$QuarantineViewHolder$bindView$3 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27918a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ QuarantineCardItem f27919b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ QuarantineCardItem.QuarantineViewHolder f27920c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QuarantineCardItem.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardItem$QuarantineViewHolder$bindView$3$1", f = "QuarantineCardItem.kt", l = {49}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardItem$QuarantineViewHolder$bindView$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27921a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ QuarantineCardItem f27922b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ QuarantineCardItem.QuarantineViewHolder f27923c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: QuarantineCardItem.kt */
        @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardItem$QuarantineViewHolder$bindView$3$1$1", f = "QuarantineCardItem.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardItem$QuarantineViewHolder$bindView$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03041 extends SuspendLambda implements p<wz.p, a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f27924a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ QuarantineCardItem.QuarantineViewHolder f27925b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03041(QuarantineCardItem.QuarantineViewHolder quarantineViewHolder, a<? super C03041> aVar) {
                super(2, aVar);
                this.f27925b = quarantineViewHolder;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(wz.p pVar, a<? super wz.p> aVar) {
                return ((C03041) create(pVar, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final a<wz.p> create(Object obj, a<?> aVar) {
                return new C03041(this.f27925b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                yk ykVar;
                b.f();
                if (this.f27924a == 0) {
                    f.b(obj);
                    ykVar = this.f27925b.f27908a;
                    Context context = ykVar.getRoot().getContext();
                    if (context != null) {
                        this.f27925b.i(context);
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(QuarantineCardItem quarantineCardItem, QuarantineCardItem.QuarantineViewHolder quarantineViewHolder, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27922b = quarantineCardItem;
            this.f27923c = quarantineViewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f27922b, this.f27923c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f27921a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SharedFlow<wz.p> e11 = this.f27922b.w().e();
                C03041 c03041 = new C03041(this.f27923c, null);
                this.f27921a = 1;
                if (FlowKt.collectLatest(e11, c03041, this) == f11) {
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
    public QuarantineCardItem$QuarantineViewHolder$bindView$3(QuarantineCardItem quarantineCardItem, QuarantineCardItem.QuarantineViewHolder quarantineViewHolder, a<? super QuarantineCardItem$QuarantineViewHolder$bindView$3> aVar) {
        super(2, aVar);
        this.f27919b = quarantineCardItem;
        this.f27920c = quarantineViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new QuarantineCardItem$QuarantineViewHolder$bindView$3(this.f27919b, this.f27920c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27918a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s v11 = this.f27919b.v();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27919b, this.f27920c, null);
            this.f27918a = 1;
            if (RepeatOnLifecycleKt.b(v11, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((QuarantineCardItem$QuarantineViewHolder$bindView$3) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
