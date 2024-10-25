package com.forsale.app.features.postad.extraattributes.attributeview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeText;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import ue.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttributeText.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeText$ViewHolder$setUpUI$2", f = "AttributeText.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AttributeText$ViewHolder$setUpUI$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35421a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeText.ViewHolder f35422b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeText.kt */
    @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeText$ViewHolder$setUpUI$2$1", f = "AttributeText.kt", l = {51}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeText$ViewHolder$setUpUI$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35423a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AttributeText.ViewHolder f35424b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AttributeText.kt */
        @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeText$ViewHolder$setUpUI$2$1$1", f = "AttributeText.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeText$ViewHolder$setUpUI$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C04081 extends SuspendLambda implements p<wz.p, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35425a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AttributeText.ViewHolder f35426b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04081(AttributeText.ViewHolder viewHolder, zz.a<? super C04081> aVar) {
                super(2, aVar);
                this.f35426b = viewHolder;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(wz.p pVar, zz.a<? super wz.p> aVar) {
                return ((C04081) create(pVar, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C04081(this.f35426b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b.f();
                if (this.f35425a == 0) {
                    f.b(obj);
                    x10.a.b("Attributes:: validateAttribute", new Object[0]);
                    this.f35426b.l();
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AttributeText.ViewHolder viewHolder, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35424b = viewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35424b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            SharedFlow<wz.p> c11;
            f11 = b.f();
            int i11 = this.f35423a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                h h02 = this.f35424b.h().h0();
                if (h02 != null && (c11 = h02.c()) != null) {
                    C04081 c04081 = new C04081(this.f35424b, null);
                    this.f35423a = 1;
                    if (FlowKt.collectLatest(c11, c04081, this) == f11) {
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
    public AttributeText$ViewHolder$setUpUI$2(AttributeText.ViewHolder viewHolder, zz.a<? super AttributeText$ViewHolder$setUpUI$2> aVar) {
        super(2, aVar);
        this.f35422b = viewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeText$ViewHolder$setUpUI$2(this.f35422b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35421a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s i12 = this.f35422b.i();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35422b, null);
            this.f35421a = 1;
            if (RepeatOnLifecycleKt.b(i12, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeText$ViewHolder$setUpUI$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
