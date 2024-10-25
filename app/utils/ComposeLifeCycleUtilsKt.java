package com.forsale.app.utils;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import j0.d1;
import j0.n1;
import j0.v0;
/* compiled from: ComposeLifeCycleUtils.kt */
/* loaded from: classes3.dex */
public final class ComposeLifeCycleUtilsKt {
    public static final void a(final g00.p<? super androidx.lifecycle.s, ? super Lifecycle.Event, wz.p> onEvent, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        kotlin.jvm.internal.o.i(onEvent, "onEvent");
        androidx.compose.runtime.a h11 = aVar.h(-192908377);
        if ((i11 & 14) == 0) {
            if (h11.F(onEvent)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-192908377, i12, -1, "com.forsale.app.utils.OnLifecycleEvent (ComposeLifeCycleUtils.kt:16)");
            }
            final n1 o11 = androidx.compose.runtime.z.o(onEvent, h11, i12 & 14);
            final n1 o12 = androidx.compose.runtime.z.o(h11.q(AndroidCompositionLocals_androidKt.i()), h11, 8);
            Object value = o12.getValue();
            h11.C(511388516);
            boolean T = h11.T(o12) | h11.T(o11);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.l<j0.s, j0.r>() { // from class: com.forsale.app.utils.ComposeLifeCycleUtilsKt$OnLifecycleEvent$1$1

                    /* compiled from: Effects.kt */
                    /* loaded from: classes3.dex */
                    public static final class a implements j0.r {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ Lifecycle f39520a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ androidx.lifecycle.p f39521b;

                        public a(Lifecycle lifecycle, androidx.lifecycle.p pVar) {
                            this.f39520a = lifecycle;
                            this.f39521b = pVar;
                        }

                        @Override // j0.r
                        public void dispose() {
                            this.f39520a.d(this.f39521b);
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // g00.l
                    /* renamed from: b */
                    public final j0.r invoke(j0.s DisposableEffect) {
                        kotlin.jvm.internal.o.i(DisposableEffect, "$this$DisposableEffect");
                        Lifecycle lifecycle = o12.getValue().getLifecycle();
                        final n1<g00.p<androidx.lifecycle.s, Lifecycle.Event, wz.p>> n1Var = o11;
                        androidx.lifecycle.p pVar = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0015: CONSTRUCTOR  (r0v1 'pVar' androidx.lifecycle.p) = (r1v0 'n1Var' j0.n1<g00.p<androidx.lifecycle.s, androidx.lifecycle.Lifecycle$Event, wz.p>> A[DONT_INLINE]) call: com.forsale.app.utils.ComposeLifeCycleUtilsKt$OnLifecycleEvent$1$1$observer$1.<init>(j0.n1):void type: CONSTRUCTOR in method: com.forsale.app.utils.ComposeLifeCycleUtilsKt$OnLifecycleEvent$1$1.b(j0.s):j0.r, file: classes3.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.utils.ComposeLifeCycleUtilsKt$OnLifecycleEvent$1$1$observer$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 15 more
                            */
                        /*
                            this = this;
                            java.lang.String r0 = "$this$DisposableEffect"
                            kotlin.jvm.internal.o.i(r3, r0)
                            j0.n1<androidx.lifecycle.s> r3 = r1
                            java.lang.Object r3 = r3.getValue()
                            androidx.lifecycle.s r3 = (androidx.lifecycle.s) r3
                            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
                            com.forsale.app.utils.ComposeLifeCycleUtilsKt$OnLifecycleEvent$1$1$observer$1 r0 = new com.forsale.app.utils.ComposeLifeCycleUtilsKt$OnLifecycleEvent$1$1$observer$1
                            j0.n1<g00.p<androidx.lifecycle.s, androidx.lifecycle.Lifecycle$Event, wz.p>> r1 = r2
                            r0.<init>(r1)
                            r3.a(r0)
                            com.forsale.app.utils.ComposeLifeCycleUtilsKt$OnLifecycleEvent$1$1$a r1 = new com.forsale.app.utils.ComposeLifeCycleUtilsKt$OnLifecycleEvent$1$1$a
                            r1.<init>(r3, r0)
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.ComposeLifeCycleUtilsKt$OnLifecycleEvent$1$1.invoke(j0.s):j0.r");
                    }
                };
                h11.u(D);
            }
            h11.S();
            j0.u.a(value, (g00.l) D, h11, 8);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.utils.ComposeLifeCycleUtilsKt$OnLifecycleEvent$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i14) {
                    ComposeLifeCycleUtilsKt.a(onEvent, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public static final void b(final g00.a<wz.p> aVar, final g00.a<wz.p> aVar2, final g00.a<wz.p> aVar3, final g00.a<wz.p> aVar4, androidx.compose.runtime.a aVar5, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        androidx.compose.runtime.a h11 = aVar5.h(-298723449);
        int i18 = i12 & 1;
        if (i18 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (h11.F(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        int i19 = i12 & 2;
        if (i19 != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (h11.F(aVar2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        int i21 = i12 & 4;
        if (i21 != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            if (h11.F(aVar3)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        int i22 = i12 & 8;
        if (i22 != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (h11.F(aVar4)) {
                i17 = RecyclerView.l.FLAG_MOVED;
            } else {
                i17 = 1024;
            }
            i13 |= i17;
        }
        if ((i13 & 5851) == 1170 && h11.i()) {
            h11.L();
        } else {
            if (i18 != 0) {
                aVar = new g00.a<wz.p>() { // from class: com.forsale.app.utils.ComposeLifeCycleUtilsKt$handleScreenEvents$1
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ wz.p invoke() {
                        invoke2();
                        return wz.p.f75480a;
                    }
                };
            }
            if (i19 != 0) {
                aVar2 = new g00.a<wz.p>() { // from class: com.forsale.app.utils.ComposeLifeCycleUtilsKt$handleScreenEvents$2
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ wz.p invoke() {
                        invoke2();
                        return wz.p.f75480a;
                    }
                };
            }
            if (i21 != 0) {
                aVar3 = new g00.a<wz.p>() { // from class: com.forsale.app.utils.ComposeLifeCycleUtilsKt$handleScreenEvents$3
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ wz.p invoke() {
                        invoke2();
                        return wz.p.f75480a;
                    }
                };
            }
            if (i22 != 0) {
                aVar4 = new g00.a<wz.p>() { // from class: com.forsale.app.utils.ComposeLifeCycleUtilsKt$handleScreenEvents$4
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ wz.p invoke() {
                        invoke2();
                        return wz.p.f75480a;
                    }
                };
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-298723449, i11, -1, "com.forsale.app.utils.handleScreenEvents (ComposeLifeCycleUtils.kt:39)");
            }
            Object[] objArr = {aVar, aVar2, aVar3, aVar4};
            h11.C(-568225417);
            boolean z11 = false;
            for (int i23 = 0; i23 < 4; i23++) {
                z11 |= h11.T(objArr[i23]);
            }
            Object D = h11.D();
            if (z11 || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.p<androidx.lifecycle.s, Lifecycle.Event, wz.p>() { // from class: com.forsale.app.utils.ComposeLifeCycleUtilsKt$handleScreenEvents$5$1

                    /* compiled from: ComposeLifeCycleUtils.kt */
                    /* loaded from: classes3.dex */
                    public /* synthetic */ class a {

                        /* renamed from: a  reason: collision with root package name */
                        public static final /* synthetic */ int[] f39533a;

                        static {
                            int[] iArr = new int[Lifecycle.Event.values().length];
                            try {
                                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[Lifecycle.Event.ON_START.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            f39533a = iArr;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.lifecycle.s owner, Lifecycle.Event event) {
                        kotlin.jvm.internal.o.i(owner, "owner");
                        kotlin.jvm.internal.o.i(event, "event");
                        int i24 = a.f39533a[event.ordinal()];
                        if (i24 != 1) {
                            if (i24 != 2) {
                                if (i24 != 3) {
                                    if (i24 == 4) {
                                        aVar4.invoke();
                                        return;
                                    }
                                    return;
                                }
                                aVar3.invoke();
                                return;
                            }
                            aVar2.invoke();
                            return;
                        }
                        aVar.invoke();
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.lifecycle.s sVar, Lifecycle.Event event) {
                        b(sVar, event);
                        return wz.p.f75480a;
                    }
                };
                h11.u(D);
            }
            h11.S();
            a((g00.p) D, h11, 0);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        final g00.a<wz.p> aVar6 = aVar;
        final g00.a<wz.p> aVar7 = aVar2;
        final g00.a<wz.p> aVar8 = aVar3;
        final g00.a<wz.p> aVar9 = aVar4;
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.utils.ComposeLifeCycleUtilsKt$handleScreenEvents$6
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar10, int i24) {
                    ComposeLifeCycleUtilsKt.b(aVar6, aVar7, aVar8, aVar9, aVar10, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar10, Integer num) {
                    b(aVar10, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }
}
