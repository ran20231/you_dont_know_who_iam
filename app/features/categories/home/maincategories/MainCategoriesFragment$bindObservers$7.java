package com.forsale.app.features.categories.home.maincategories;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.c;
import com.forsale.app.features.categories.home.CategoriesNavGraphViewModel;
import com.forsale.app.utils.ContextExtensionsKt;
import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import t9.y0;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainCategoriesFragment.kt */
@d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$bindObservers$7", f = "MainCategoriesFragment.kt", l = {408}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainCategoriesFragment$bindObservers$7 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24354a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainCategoriesFragment f24355b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainCategoriesFragment$bindObservers$7(MainCategoriesFragment mainCategoriesFragment, zz.a<? super MainCategoriesFragment$bindObservers$7> aVar) {
        super(1, aVar);
        this.f24355b = mainCategoriesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new MainCategoriesFragment$bindObservers$7(this.f24355b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoriesNavGraphViewModel b02;
        f11 = b.f();
        int i11 = this.f24354a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            b02 = this.f24355b.b0();
            SharedFlow<p> H0 = b02.H0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24355b, null);
            this.f24354a = 1;
            if (FlowKt.collectLatest(H0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((MainCategoriesFragment$bindObservers$7) create(aVar)).invokeSuspend(p.f75480a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainCategoriesFragment.kt */
    @d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$bindObservers$7$1", f = "MainCategoriesFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$bindObservers$7$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24356a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MainCategoriesFragment f24357b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MainCategoriesFragment mainCategoriesFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f24357b = mainCategoriesFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f24357b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f24356a == 0) {
                f.b(obj);
                Context context = this.f24357b.getContext();
                if (context != null) {
                    String string = this.f24357b.getString(y0.O5);
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
        /* renamed from: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$bindObservers$7$1$a */
        /* loaded from: classes2.dex */
        public static final class a implements DialogInterface.OnClickListener {
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
            }
        }
    }
}
