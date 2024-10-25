package com.forsale.adserver.view.screens.detailsScreen;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.c;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.forsale.adserver.utils.extensions.ContextExtensionsKt;
import com.forsale.adserver.view.viewmodel.NewDetailsViewModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsBottomSheet.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$5", f = "NewDetailsBottomSheet.kt", l = {430}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewDetailsBottomSheet$bindObservers$5 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21308a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewDetailsBottomSheet f21309b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewDetailsBottomSheet.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$5$1", f = "NewDetailsBottomSheet.kt", l = {431}, m = "invokeSuspend")
    /* renamed from: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$5$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f21310a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NewDetailsBottomSheet f21311b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NewDetailsBottomSheet.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$5$1$1", f = "NewDetailsBottomSheet.kt", l = {436}, m = "invokeSuspend")
        /* renamed from: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$5$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02381 extends SuspendLambda implements g00.p<wz.p, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            Object f21312a;

            /* renamed from: b  reason: collision with root package name */
            Object f21313b;

            /* renamed from: c  reason: collision with root package name */
            Object f21314c;

            /* renamed from: d  reason: collision with root package name */
            int f21315d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ NewDetailsBottomSheet f21316e;

            /* compiled from: ContextExtensions.kt */
            /* renamed from: com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$bindObservers$5$1$1$a */
            /* loaded from: classes2.dex */
            public static final class a implements DialogInterface.OnClickListener {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ NewDetailsBottomSheet f21317a;

                public a(NewDetailsBottomSheet newDetailsBottomSheet) {
                    this.f21317a = newDetailsBottomSheet;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    kotlin.jvm.internal.o.f(dialogInterface);
                    dialogInterface.dismiss();
                    this.f21317a.dismiss();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02381(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super C02381> aVar) {
                super(2, aVar);
                this.f21316e = newDetailsBottomSheet;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(wz.p pVar, zz.a<? super wz.p> aVar) {
                return ((C02381) create(pVar, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C02381(this.f21316e, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object f11;
                androidx.appcompat.app.c cVar;
                NewDetailsBottomSheet newDetailsBottomSheet;
                f11 = kotlin.coroutines.intrinsics.b.f();
                int i11 = this.f21315d;
                if (i11 != 0) {
                    if (i11 == 1) {
                        cVar = (androidx.appcompat.app.c) this.f21314c;
                        newDetailsBottomSheet = (NewDetailsBottomSheet) this.f21313b;
                        androidx.appcompat.app.c cVar2 = (androidx.appcompat.app.c) this.f21312a;
                        kotlin.f.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.f.b(obj);
                    Context context = this.f21316e.getContext();
                    androidx.appcompat.app.c cVar3 = null;
                    if (context != null) {
                        String string = this.f21316e.getString(l8.h.f62336e);
                        kotlin.jvm.internal.o.h(string, "getString(...)");
                        NewDetailsBottomSheet newDetailsBottomSheet2 = this.f21316e;
                        if (ContextExtensionsKt.a(context)) {
                            c.a aVar = new c.a(context);
                            aVar.h(string);
                            aVar.m(context.getString(l8.h.f62343l), new a(newDetailsBottomSheet2));
                            aVar.d(false);
                            androidx.appcompat.app.c a11 = aVar.a();
                            kotlin.jvm.internal.o.h(a11, "create(...)");
                            a11.show();
                            cVar3 = a11;
                        }
                    }
                    NewDetailsBottomSheet newDetailsBottomSheet3 = this.f21316e;
                    this.f21312a = cVar3;
                    this.f21313b = newDetailsBottomSheet3;
                    this.f21314c = cVar3;
                    this.f21315d = 1;
                    if (DelayKt.delay(3000L, this) == f11) {
                        return f11;
                    }
                    cVar = cVar3;
                    newDetailsBottomSheet = newDetailsBottomSheet3;
                }
                if (cVar != null && cVar.isShowing()) {
                    cVar.dismiss();
                }
                if (newDetailsBottomSheet.isVisible()) {
                    newDetailsBottomSheet.dismiss();
                }
                return wz.p.f75480a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f21311b = newDetailsBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f21311b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            NewDetailsViewModel M;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f21310a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                M = this.f21311b.M();
                SharedFlow<wz.p> N = M.N();
                C02381 c02381 = new C02381(this.f21311b, null);
                this.f21310a = 1;
                if (FlowKt.collectLatest(N, c02381, this) == f11) {
                    return f11;
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
    public NewDetailsBottomSheet$bindObservers$5(NewDetailsBottomSheet newDetailsBottomSheet, zz.a<? super NewDetailsBottomSheet$bindObservers$5> aVar) {
        super(2, aVar);
        this.f21309b = newDetailsBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewDetailsBottomSheet$bindObservers$5(this.f21309b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f21308a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            NewDetailsBottomSheet newDetailsBottomSheet = this.f21309b;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(newDetailsBottomSheet, null);
            this.f21308a = 1;
            if (RepeatOnLifecycleKt.b(newDetailsBottomSheet, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewDetailsBottomSheet$bindObservers$5) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
