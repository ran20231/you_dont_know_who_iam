package com.forsale.app.features.postad.extraattributes.attributeview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontal;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttributeDropDownHorizontal.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontal$ViewHolder$setUpUI$1$2", f = "AttributeDropDownHorizontal.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AttributeDropDownHorizontal$ViewHolder$setUpUI$1$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35233a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s f35234b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AttributeDropDownHorizontal.ViewHolder f35235c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeDropDownHorizontal.kt */
    @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontal$ViewHolder$setUpUI$1$2$1", f = "AttributeDropDownHorizontal.kt", l = {87}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontal$ViewHolder$setUpUI$1$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35236a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AttributeDropDownHorizontal.ViewHolder f35237b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AttributeDropDownHorizontal.kt */
        @d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontal$ViewHolder$setUpUI$1$2$1$1", f = "AttributeDropDownHorizontal.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontal$ViewHolder$setUpUI$1$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03961 extends SuspendLambda implements p<wz.p, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35238a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AttributeDropDownHorizontal.ViewHolder f35239b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03961(AttributeDropDownHorizontal.ViewHolder viewHolder, zz.a<? super C03961> aVar) {
                super(2, aVar);
                this.f35239b = viewHolder;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(wz.p pVar, zz.a<? super wz.p> aVar) {
                return ((C03961) create(pVar, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C03961(this.f35239b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b.f();
                if (this.f35238a == 0) {
                    f.b(obj);
                    this.f35239b.r();
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AttributeDropDownHorizontal.ViewHolder viewHolder, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35237b = viewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35237b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            SharedFlow<wz.p> g11;
            f11 = b.f();
            int i11 = this.f35236a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                AttributeDropDownHorizontalViewModel h02 = this.f35237b.m().h0();
                if (h02 != null && (g11 = h02.g()) != null) {
                    C03961 c03961 = new C03961(this.f35237b, null);
                    this.f35236a = 1;
                    if (FlowKt.collectLatest(g11, c03961, this) == f11) {
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
    public AttributeDropDownHorizontal$ViewHolder$setUpUI$1$2(s sVar, AttributeDropDownHorizontal.ViewHolder viewHolder, zz.a<? super AttributeDropDownHorizontal$ViewHolder$setUpUI$1$2> aVar) {
        super(2, aVar);
        this.f35234b = sVar;
        this.f35235c = viewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeDropDownHorizontal$ViewHolder$setUpUI$1$2(this.f35234b, this.f35235c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35233a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s it2 = this.f35234b;
            o.h(it2, "$it");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35235c, null);
            this.f35233a = 1;
            if (RepeatOnLifecycleKt.b(it2, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeDropDownHorizontal$ViewHolder$setUpUI$1$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
