package com.forsale.app.features.postad.extraattributes.attributeview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttributeDropDownVertical.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$setUpUI$4", f = "AttributeDropDownVertical.kt", l = {FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AttributeDropDownVertical$ViewHolder$setUpUI$4 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35280a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeDropDownVertical f35281b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AttributeDropDownVertical.ViewHolder f35282c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeDropDownVertical.kt */
    @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$setUpUI$4$1", f = "AttributeDropDownVertical.kt", l = {FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$setUpUI$4$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35283a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AttributeDropDownVertical.ViewHolder f35284b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AttributeDropDownVertical.kt */
        @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$setUpUI$4$1$1", f = "AttributeDropDownVertical.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical$ViewHolder$setUpUI$4$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03991 extends SuspendLambda implements p<wz.p, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35285a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AttributeDropDownVertical.ViewHolder f35286b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03991(AttributeDropDownVertical.ViewHolder viewHolder, zz.a<? super C03991> aVar) {
                super(2, aVar);
                this.f35286b = viewHolder;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(wz.p pVar, zz.a<? super wz.p> aVar) {
                return ((C03991) create(pVar, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C03991(this.f35286b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b.f();
                if (this.f35285a == 0) {
                    f.b(obj);
                    this.f35286b.p();
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AttributeDropDownVertical.ViewHolder viewHolder, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35284b = viewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35284b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            SharedFlow<wz.p> k11;
            f11 = b.f();
            int i11 = this.f35283a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                AttributeDropDownVerticalViewModel h02 = this.f35284b.j().h0();
                if (h02 != null && (k11 = h02.k()) != null) {
                    C03991 c03991 = new C03991(this.f35284b, null);
                    this.f35283a = 1;
                    if (FlowKt.collectLatest(k11, c03991, this) == f11) {
                        return f11;
                    }
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeDropDownVertical$ViewHolder$setUpUI$4(AttributeDropDownVertical attributeDropDownVertical, AttributeDropDownVertical.ViewHolder viewHolder, zz.a<? super AttributeDropDownVertical$ViewHolder$setUpUI$4> aVar) {
        super(2, aVar);
        this.f35281b = attributeDropDownVertical;
        this.f35282c = viewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeDropDownVertical$ViewHolder$setUpUI$4(this.f35281b, this.f35282c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35280a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s w11 = this.f35281b.w();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35282c, null);
            this.f35280a = 1;
            if (RepeatOnLifecycleKt.b(w11, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeDropDownVertical$ViewHolder$setUpUI$4) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
