package com.forsale.app.features.categories.home.homelandingscreen;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.c;
import com.forsale.app.features.categories.home.CategoriesNavGraphViewModel;
import com.forsale.app.utils.ContextExtensionsKt;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import t9.y0;
import wz.p;
/* compiled from: VerticalFragment.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$14", f = "VerticalFragment.kt", l = {188}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VerticalFragment$onViewCreated$14 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23877a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalFragment f23878b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalFragment$onViewCreated$14(VerticalFragment verticalFragment, zz.a<? super VerticalFragment$onViewCreated$14> aVar) {
        super(1, aVar);
        this.f23878b = verticalFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new VerticalFragment$onViewCreated$14(this.f23878b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoriesNavGraphViewModel k02;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23877a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            k02 = this.f23878b.k0();
            SharedFlow<p> H0 = k02.H0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23878b, null);
            this.f23877a = 1;
            if (FlowKt.collectLatest(H0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((VerticalFragment$onViewCreated$14) create(aVar)).invokeSuspend(p.f75480a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalFragment.kt */
    @d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$14$1", f = "VerticalFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$14$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f23879a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VerticalFragment f23880b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VerticalFragment verticalFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f23880b = verticalFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f23880b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f23879a == 0) {
                f.b(obj);
                Context context = this.f23880b.getContext();
                if (context != null) {
                    String string = this.f23880b.getString(y0.O5);
                    o.h(string, "getString(...)");
                    if (ContextExtensionsKt.f(context)) {
                        c.a aVar = new c.a(context);
                        aVar.o(y0.R4);
                        aVar.h(string);
                        aVar.m(context.getString(y0.Z4), new a());
                        aVar.d(false);
                        aVar.q();
                    }
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: ViewsExtensions.kt */
        /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$14$1$a */
        /* loaded from: classes2.dex */
        public static final class a implements DialogInterface.OnClickListener {
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
            }
        }
    }
}
