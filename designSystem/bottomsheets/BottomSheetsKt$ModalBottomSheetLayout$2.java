package com.forsale.designSystem.bottomsheets;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.node.ComposeUiNode;
import b1.s4;
import b1.t1;
import c0.g;
import com.forsale.designSystem.SurfaceKt;
import e2.h;
import g00.l;
import g00.q;
import j0.e1;
import j0.k;
import j0.k0;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import q1.n;
import q1.s;
import v0.b;
import w.d;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheets.kt */
/* loaded from: classes3.dex */
public final class BottomSheetsKt$ModalBottomSheetLayout$2 extends Lambda implements q<d, a, Integer, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f40790a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g00.a<p> f40791b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f40792c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ s4 f40793d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f40794e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ float f40795f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ long f40796g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f40797h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ g00.a<p> f40798i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ g00.p<a, Integer, p> f40799j;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ g00.p<a, Integer, p> f40800x;

    /* renamed from: y  reason: collision with root package name */
    final /* synthetic */ g00.p<a, Integer, p> f40801y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheets.kt */
    /* renamed from: com.forsale.designSystem.bottomsheets.BottomSheetsKt$ModalBottomSheetLayout$2$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass4 extends Lambda implements l<s, p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetState f40810a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f40811b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BottomSheets.kt */
        /* renamed from: com.forsale.designSystem.bottomsheets.BottomSheetsKt$ModalBottomSheetLayout$2$4$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass1 extends Lambda implements g00.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ModalBottomSheetState f40812a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CoroutineScope f40813b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: BottomSheets.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.forsale.designSystem.bottomsheets.BottomSheetsKt$ModalBottomSheetLayout$2$4$1$1", f = "BottomSheets.kt", l = {130}, m = "invokeSuspend")
            /* renamed from: com.forsale.designSystem.bottomsheets.BottomSheetsKt$ModalBottomSheetLayout$2$4$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C04641 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f40814a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ ModalBottomSheetState f40815b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C04641(ModalBottomSheetState modalBottomSheetState, zz.a<? super C04641> aVar) {
                    super(2, aVar);
                    this.f40815b = modalBottomSheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                    return new C04641(this.f40815b, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    f11 = b.f();
                    int i11 = this.f40814a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f.b(obj);
                        ModalBottomSheetState modalBottomSheetState = this.f40815b;
                        this.f40814a = 1;
                        if (modalBottomSheetState.M(this) == f11) {
                            return f11;
                        }
                    }
                    return p.f75480a;
                }

                @Override // g00.p
                public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                    return ((C04641) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope) {
                super(0);
                this.f40812a = modalBottomSheetState;
                this.f40813b = coroutineScope;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                if (this.f40812a.n().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
                    BuildersKt__Builders_commonKt.launch$default(this.f40813b, null, null, new C04641(this.f40812a, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BottomSheets.kt */
        /* renamed from: com.forsale.designSystem.bottomsheets.BottomSheetsKt$ModalBottomSheetLayout$2$4$2  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass2 extends Lambda implements g00.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ModalBottomSheetState f40816a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CoroutineScope f40817b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: BottomSheets.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.forsale.designSystem.bottomsheets.BottomSheetsKt$ModalBottomSheetLayout$2$4$2$1", f = "BottomSheets.kt", l = {137}, m = "invokeSuspend")
            /* renamed from: com.forsale.designSystem.bottomsheets.BottomSheetsKt$ModalBottomSheetLayout$2$4$2$1  reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f40818a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ ModalBottomSheetState f40819b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ModalBottomSheetState modalBottomSheetState, zz.a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f40819b = modalBottomSheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                    return new AnonymousClass1(this.f40819b, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    f11 = b.f();
                    int i11 = this.f40818a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f.b(obj);
                        ModalBottomSheetState modalBottomSheetState = this.f40819b;
                        this.f40818a = 1;
                        if (modalBottomSheetState.J(this) == f11) {
                            return f11;
                        }
                    }
                    return p.f75480a;
                }

                @Override // g00.p
                public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                    return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope) {
                super(0);
                this.f40816a = modalBottomSheetState;
                this.f40817b = coroutineScope;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                if (this.f40816a.n().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
                    BuildersKt__Builders_commonKt.launch$default(this.f40817b, null, null, new AnonymousClass1(this.f40816a, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BottomSheets.kt */
        /* renamed from: com.forsale.designSystem.bottomsheets.BottomSheetsKt$ModalBottomSheetLayout$2$4$3  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass3 extends Lambda implements g00.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ModalBottomSheetState f40820a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CoroutineScope f40821b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: BottomSheets.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.forsale.designSystem.bottomsheets.BottomSheetsKt$ModalBottomSheetLayout$2$4$3$1", f = "BottomSheets.kt", l = {144}, m = "invokeSuspend")
            /* renamed from: com.forsale.designSystem.bottomsheets.BottomSheetsKt$ModalBottomSheetLayout$2$4$3$1  reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f40822a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ ModalBottomSheetState f40823b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ModalBottomSheetState modalBottomSheetState, zz.a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f40823b = modalBottomSheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                    return new AnonymousClass1(this.f40823b, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    f11 = b.f();
                    int i11 = this.f40822a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f.b(obj);
                        ModalBottomSheetState modalBottomSheetState = this.f40823b;
                        this.f40822a = 1;
                        if (modalBottomSheetState.L(this) == f11) {
                            return f11;
                        }
                    }
                    return p.f75480a;
                }

                @Override // g00.p
                public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                    return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope) {
                super(0);
                this.f40820a = modalBottomSheetState;
                this.f40821b = coroutineScope;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                if (this.f40820a.n().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
                    BuildersKt__Builders_commonKt.launch$default(this.f40821b, null, null, new AnonymousClass1(this.f40820a, null), 3, null);
                }
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope) {
            super(1);
            this.f40810a = modalBottomSheetState;
            this.f40811b = coroutineScope;
        }

        public final void b(s semantics) {
            o.i(semantics, "$this$semantics");
            if (this.f40810a.O()) {
                q1.q.n(semantics, null, new AnonymousClass1(this.f40810a, this.f40811b), 1, null);
                if (this.f40810a.o() == ModalBottomSheetValue.HalfExpanded) {
                    q1.q.p(semantics, null, new AnonymousClass2(this.f40810a, this.f40811b), 1, null);
                } else if (this.f40810a.K()) {
                    q1.q.f(semantics, null, new AnonymousClass3(this.f40810a, this.f40811b), 1, null);
                }
            }
        }

        @Override // g00.l
        public /* bridge */ /* synthetic */ p invoke(s sVar) {
            b(sVar);
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheets.kt */
    /* renamed from: com.forsale.designSystem.bottomsheets.BottomSheetsKt$ModalBottomSheetLayout$2$5  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass5 extends Lambda implements g00.p<a, Integer, p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g00.p<a, Integer, p> f40824a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40825b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g00.p<a, Integer, p> f40826c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g00.p<a, Integer, p> f40827d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BottomSheets.kt */
        /* renamed from: com.forsale.designSystem.bottomsheets.BottomSheetsKt$ModalBottomSheetLayout$2$5$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass1 extends Lambda implements g00.p<a, Integer, p> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g00.p<a, Integer, p> f40828a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f40829b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ g00.p<a, Integer, p> f40830c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ g00.p<a, Integer, p> f40831d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(g00.p<? super a, ? super Integer, p> pVar, int i11, g00.p<? super a, ? super Integer, p> pVar2, g00.p<? super a, ? super Integer, p> pVar3) {
                super(2);
                this.f40828a = pVar;
                this.f40829b = i11;
                this.f40830c = pVar2;
                this.f40831d = pVar3;
            }

            public final void b(a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (c.I()) {
                    c.U(-1089514911, i11, -1, "com.forsale.designSystem.bottomsheets.ModalBottomSheetLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheets.kt:156)");
                }
                c.a aVar2 = androidx.compose.ui.c.f7566a;
                androidx.compose.ui.c h11 = SizeKt.h(aVar2, 0.0f, 1, null);
                g00.p<a, Integer, p> pVar = this.f40828a;
                int i12 = this.f40829b;
                g00.p<a, Integer, p> pVar2 = this.f40830c;
                g00.p<a, Integer, p> pVar3 = this.f40831d;
                aVar.C(-483455358);
                Arrangement arrangement = Arrangement.f3698a;
                Arrangement.m h12 = arrangement.h();
                b.a aVar3 = v0.b.f74009a;
                a0 a11 = e.a(h12, aVar3.k(), aVar, 0);
                aVar.C(-1323940314);
                int a12 = j0.e.a(aVar, 0);
                k s11 = aVar.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(h11);
                if (!(aVar.k() instanceof j0.d)) {
                    j0.e.c();
                }
                aVar.I();
                if (aVar.f()) {
                    aVar.y(a13);
                } else {
                    aVar.t();
                }
                a a14 = Updater.a(aVar);
                Updater.c(a14, a11, companion.e());
                Updater.c(a14, s11, companion.g());
                g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.p(Integer.valueOf(a12), b11);
                }
                c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
                aVar.C(2058660585);
                w.f fVar = w.f.f74891a;
                aVar.C(733328855);
                a0 g11 = BoxKt.g(aVar3.o(), false, aVar, 0);
                aVar.C(-1323940314);
                int a15 = j0.e.a(aVar, 0);
                k s12 = aVar.s();
                g00.a<ComposeUiNode> a16 = companion.a();
                q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(aVar2);
                if (!(aVar.k() instanceof j0.d)) {
                    j0.e.c();
                }
                aVar.I();
                if (aVar.f()) {
                    aVar.y(a16);
                } else {
                    aVar.t();
                }
                a a17 = Updater.a(aVar);
                Updater.c(a17, g11, companion.e());
                Updater.c(a17, s12, companion.g());
                g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                if (a17.f() || !o.d(a17.D(), Integer.valueOf(a15))) {
                    a17.u(Integer.valueOf(a15));
                    a17.p(Integer.valueOf(a15), b12);
                }
                c12.invoke(e1.a(e1.b(aVar)), aVar, 0);
                aVar.C(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
                pVar.invoke(aVar, Integer.valueOf((i12 >> 3) & 14));
                aVar.S();
                aVar.w();
                aVar.S();
                aVar.S();
                androidx.compose.ui.c h13 = SizeKt.h(aVar2, 0.0f, 1, null);
                aVar.C(-483455358);
                a0 a18 = e.a(arrangement.h(), aVar3.k(), aVar, 0);
                aVar.C(-1323940314);
                int a19 = j0.e.a(aVar, 0);
                k s13 = aVar.s();
                g00.a<ComposeUiNode> a21 = companion.a();
                q<e1<ComposeUiNode>, a, Integer, p> c13 = LayoutKt.c(h13);
                if (!(aVar.k() instanceof j0.d)) {
                    j0.e.c();
                }
                aVar.I();
                if (aVar.f()) {
                    aVar.y(a21);
                } else {
                    aVar.t();
                }
                a a22 = Updater.a(aVar);
                Updater.c(a22, a18, companion.e());
                Updater.c(a22, s13, companion.g());
                g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
                if (a22.f() || !o.d(a22.D(), Integer.valueOf(a19))) {
                    a22.u(Integer.valueOf(a19));
                    a22.p(Integer.valueOf(a19), b13);
                }
                c13.invoke(e1.a(e1.b(aVar)), aVar, 0);
                aVar.C(2058660585);
                androidx.compose.ui.c a23 = fVar.a(aVar2, 1.0f, false);
                aVar.C(733328855);
                a0 g12 = BoxKt.g(aVar3.o(), false, aVar, 0);
                aVar.C(-1323940314);
                int a24 = j0.e.a(aVar, 0);
                k s14 = aVar.s();
                g00.a<ComposeUiNode> a25 = companion.a();
                q<e1<ComposeUiNode>, a, Integer, p> c14 = LayoutKt.c(a23);
                if (!(aVar.k() instanceof j0.d)) {
                    j0.e.c();
                }
                aVar.I();
                if (aVar.f()) {
                    aVar.y(a25);
                } else {
                    aVar.t();
                }
                a a26 = Updater.a(aVar);
                Updater.c(a26, g12, companion.e());
                Updater.c(a26, s14, companion.g());
                g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
                if (a26.f() || !o.d(a26.D(), Integer.valueOf(a24))) {
                    a26.u(Integer.valueOf(a24));
                    a26.p(Integer.valueOf(a24), b14);
                }
                c14.invoke(e1.a(e1.b(aVar)), aVar, 0);
                aVar.C(2058660585);
                pVar3.invoke(aVar, Integer.valueOf((i12 >> 24) & 14));
                aVar.S();
                aVar.w();
                aVar.S();
                aVar.S();
                pVar2.invoke(aVar, Integer.valueOf((i12 >> 6) & 14));
                aVar.S();
                aVar.w();
                aVar.S();
                aVar.S();
                aVar.S();
                aVar.w();
                aVar.S();
                aVar.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(a aVar, Integer num) {
                b(aVar, num.intValue());
                return p.f75480a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(g00.p<? super a, ? super Integer, p> pVar, int i11, g00.p<? super a, ? super Integer, p> pVar2, g00.p<? super a, ? super Integer, p> pVar3) {
            super(2);
            this.f40824a = pVar;
            this.f40825b = i11;
            this.f40826c = pVar2;
            this.f40827d = pVar3;
        }

        public final void b(a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1950529317, i11, -1, "com.forsale.designSystem.bottomsheets.ModalBottomSheetLayout.<anonymous>.<anonymous> (BottomSheets.kt:155)");
            }
            float f11 = 16;
            SurfaceKt.c(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), g.e(h.l(f11), h.l(f11), 0.0f, 0.0f, 12, null), 0L, 0L, null, 0.0f, r0.b.b(aVar, -1089514911, true, new AnonymousClass1(this.f40824a, this.f40825b, this.f40826c, this.f40827d)), aVar, 1572870, 60);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ p invoke(a aVar, Integer num) {
            b(aVar, num.intValue());
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetsKt$ModalBottomSheetLayout$2(ModalBottomSheetState modalBottomSheetState, g00.a<p> aVar, int i11, s4 s4Var, long j11, float f11, long j12, CoroutineScope coroutineScope, g00.a<p> aVar2, g00.p<? super a, ? super Integer, p> pVar, g00.p<? super a, ? super Integer, p> pVar2, g00.p<? super a, ? super Integer, p> pVar3) {
        super(3);
        this.f40790a = modalBottomSheetState;
        this.f40791b = aVar;
        this.f40792c = i11;
        this.f40793d = s4Var;
        this.f40794e = j11;
        this.f40795f = f11;
        this.f40796g = j12;
        this.f40797h = coroutineScope;
        this.f40798i = aVar2;
        this.f40799j = pVar;
        this.f40800x = pVar2;
        this.f40801y = pVar3;
    }

    public final void b(d BoxWithConstraints, a aVar, int i11) {
        int i12;
        boolean z11;
        androidx.compose.ui.c i13;
        int i14;
        o.i(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i11 & 14) == 0) {
            if (aVar.T(BoxWithConstraints)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 91) == 18 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1141118433, i11, -1, "com.forsale.designSystem.bottomsheets.ModalBottomSheetLayout.<anonymous> (BottomSheets.kt:93)");
        }
        float m11 = e2.b.m(BoxWithConstraints.b());
        aVar.C(-492369756);
        Object D = aVar.D();
        a.C0064a c0064a = a.f7182a;
        if (D == c0064a.a()) {
            D = c0.e(null, null, 2, null);
            aVar.u(D);
        }
        aVar.S();
        k0 k0Var = (k0) D;
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c f11 = SizeKt.f(aVar2, 0.0f, 1, null);
        long j11 = this.f40796g;
        ModalBottomSheetState modalBottomSheetState = this.f40790a;
        int i15 = this.f40792c;
        CoroutineScope coroutineScope = this.f40797h;
        g00.a<p> aVar3 = this.f40798i;
        aVar.C(733328855);
        a0 g11 = BoxKt.g(v0.b.f74009a.o(), false, aVar, 0);
        aVar.C(-1323940314);
        int a11 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(f11);
        if (!(aVar.k() instanceof j0.d)) {
            j0.e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a12);
        } else {
            aVar.t();
        }
        a a13 = Updater.a(aVar);
        Updater.c(a13, g11, companion.e());
        Updater.c(a13, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b11);
        }
        c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        BottomSheetsKt$ModalBottomSheetLayout$2$1$1 bottomSheetsKt$ModalBottomSheetLayout$2$1$1 = new BottomSheetsKt$ModalBottomSheetLayout$2$1$1(modalBottomSheetState, coroutineScope, aVar3);
        if (modalBottomSheetState.u() != ModalBottomSheetValue.Hidden) {
            z11 = true;
        } else {
            z11 = false;
        }
        BottomSheetsKt.c(j11, bottomSheetsKt$ModalBottomSheetLayout$2$1$1, z11, aVar, (i15 >> 21) & 14);
        aVar.S();
        aVar.w();
        aVar.S();
        aVar.S();
        androidx.compose.ui.c b12 = androidx.compose.ui.input.nestedscroll.a.b(SizeKt.h(aVar2, 0.0f, 1, null), SwipeableStateKt.f(this.f40790a, this.f40791b), null, 2, null);
        Object obj = this.f40790a;
        Object valueOf = Float.valueOf(m11);
        ModalBottomSheetState modalBottomSheetState2 = this.f40790a;
        aVar.C(511388516);
        boolean T = aVar.T(obj) | aVar.T(valueOf);
        Object D2 = aVar.D();
        if (T || D2 == c0064a.a()) {
            D2 = new BottomSheetsKt$ModalBottomSheetLayout$2$2$1(modalBottomSheetState2, m11);
            aVar.u(D2);
        }
        aVar.S();
        i13 = BottomSheetsKt.i(OffsetKt.a(b12, (l) D2), this.f40790a, m11, k0Var, this.f40791b);
        aVar.C(1157296644);
        boolean T2 = aVar.T(k0Var);
        Object D3 = aVar.D();
        if (T2 || D3 == c0064a.a()) {
            D3 = new BottomSheetsKt$ModalBottomSheetLayout$2$3$1(k0Var);
            aVar.u(D3);
        }
        aVar.S();
        androidx.compose.ui.c c12 = n.c(g0.a(i13, (l) D3), false, new AnonymousClass4(this.f40790a, this.f40797h), 1, null);
        long d11 = t1.f15974b.d();
        s4 s4Var = this.f40793d;
        long j12 = this.f40794e;
        float f12 = this.f40795f;
        r0.a b13 = r0.b.b(aVar, 1950529317, true, new AnonymousClass5(this.f40799j, this.f40792c, this.f40800x, this.f40801y));
        int i16 = this.f40792c;
        SurfaceKt.c(c12, s4Var, d11, j12, null, f12, b13, aVar, (i16 & 458752) | ((i16 >> 9) & 112) | 1573248 | ((i16 >> 9) & 7168), 16);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ p invoke(d dVar, a aVar, Integer num) {
        b(dVar, aVar, num.intValue());
        return p.f75480a;
    }
}
