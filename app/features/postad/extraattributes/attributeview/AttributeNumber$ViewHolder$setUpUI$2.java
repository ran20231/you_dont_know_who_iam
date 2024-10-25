package com.forsale.app.features.postad.extraattributes.attributeview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeNumber;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttributeNumber.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeNumber$ViewHolder$setUpUI$2", f = "AttributeNumber.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AttributeNumber$ViewHolder$setUpUI$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35408a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeNumber.ViewHolder f35409b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeNumber.kt */
    @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeNumber$ViewHolder$setUpUI$2$1", f = "AttributeNumber.kt", l = {58}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeNumber$ViewHolder$setUpUI$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35410a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AttributeNumber.ViewHolder f35411b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AttributeNumber.kt */
        @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeNumber$ViewHolder$setUpUI$2$1$1", f = "AttributeNumber.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeNumber$ViewHolder$setUpUI$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C04071 extends SuspendLambda implements p<wz.p, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35412a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AttributeNumber.ViewHolder f35413b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04071(AttributeNumber.ViewHolder viewHolder, zz.a<? super C04071> aVar) {
                super(2, aVar);
                this.f35413b = viewHolder;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(wz.p pVar, zz.a<? super wz.p> aVar) {
                return ((C04071) create(pVar, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C04071(this.f35413b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b.f();
                if (this.f35412a == 0) {
                    f.b(obj);
                    this.f35413b.l();
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AttributeNumber.ViewHolder viewHolder, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35411b = viewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35411b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            SharedFlow<wz.p> d11;
            f11 = b.f();
            int i11 = this.f35410a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                ue.f h02 = this.f35411b.h().h0();
                if (h02 != null && (d11 = h02.d()) != null) {
                    C04071 c04071 = new C04071(this.f35411b, null);
                    this.f35410a = 1;
                    if (FlowKt.collectLatest(d11, c04071, this) == f11) {
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
    public AttributeNumber$ViewHolder$setUpUI$2(AttributeNumber.ViewHolder viewHolder, zz.a<? super AttributeNumber$ViewHolder$setUpUI$2> aVar) {
        super(2, aVar);
        this.f35409b = viewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeNumber$ViewHolder$setUpUI$2(this.f35409b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35408a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s i12 = this.f35409b.i();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35409b, null);
            this.f35408a = 1;
            if (RepeatOnLifecycleKt.b(i12, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeNumber$ViewHolder$setUpUI$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
