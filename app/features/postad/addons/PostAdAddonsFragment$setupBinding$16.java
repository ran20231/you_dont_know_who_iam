package com.forsale.app.features.postad.addons;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import androidx.navigation.NavController;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.features.postad.PLFActivity;
import com.forsale.app.features.postad.PostAdDialogs;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.addons.a;
import com.forsale.app.features.postad.f;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAddonsFragment.kt */
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$16", f = "PostAdAddonsFragment.kt", l = {296}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsFragment$setupBinding$16 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34265a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsFragment f34266b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdAddonsFragment.kt */
    @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$16$1", f = "PostAdAddonsFragment.kt", l = {297}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$16$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34267a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdAddonsFragment f34268b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PostAdAddonsFragment.kt */
        @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$16$1$1", f = "PostAdAddonsFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$16$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03761 extends SuspendLambda implements p<f, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f34269a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f34270b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PostAdAddonsFragment f34271c;

            /* compiled from: PostAdAddonsFragment.kt */
            /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$16$1$1$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f34276a;

                static {
                    int[] iArr = new int[PostAdDialogs.values().length];
                    try {
                        iArr[PostAdDialogs.UploadSuccess.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PostAdDialogs.UploadWaitingApproval.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PostAdDialogs.UploadMediaFailed.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PostAdDialogs.NotEnoughCreditNew.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[PostAdDialogs.NotEnoughCreditForAddons.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[PostAdDialogs.NotEnoughCreditForAddonsEdit.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[PostAdDialogs.GeneralError.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    f34276a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03761(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super C03761> aVar) {
                super(2, aVar);
                this.f34271c = postAdAddonsFragment;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(f fVar, zz.a<? super wz.p> aVar) {
                return ((C03761) create(fVar, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                C03761 c03761 = new C03761(this.f34271c, aVar);
                c03761.f34270b = obj;
                return c03761;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                PostAdViewModel i02;
                PostAdViewModel i03;
                PostAdViewModel i04;
                PostAdViewModel i05;
                PostAdViewModel i06;
                kotlin.coroutines.intrinsics.b.f();
                if (this.f34269a == 0) {
                    kotlin.f.b(obj);
                    f fVar = (f) this.f34270b;
                    int i11 = -1;
                    switch (a.f34276a[fVar.a().ordinal()]) {
                        case 1:
                            PostAdDialoguesUtilsKt.n(this.f34271c);
                            break;
                        case 2:
                            PostAdAddonsFragment postAdAddonsFragment = this.f34271c;
                            i02 = postAdAddonsFragment.i0();
                            PostAdDialoguesUtilsKt.q(postAdAddonsFragment, i02);
                            break;
                        case 3:
                            PostAdAddonsFragment postAdAddonsFragment2 = this.f34271c;
                            boolean d11 = fVar.d();
                            Integer b11 = fVar.b();
                            if (b11 != null) {
                                i11 = b11.intValue();
                            }
                            List<Addon> c11 = fVar.c();
                            PostAdDialogs postAdDialogs = PostAdDialogs.UploadMediaFailed;
                            i03 = this.f34271c.i0();
                            PostAdDialoguesUtilsKt.o(postAdAddonsFragment2, false, d11, i11, c11, postAdDialogs, i03);
                            break;
                        case 4:
                            PostAdAddonsFragment postAdAddonsFragment3 = this.f34271c;
                            i04 = postAdAddonsFragment3.i0();
                            final PostAdAddonsFragment postAdAddonsFragment4 = this.f34271c;
                            g00.a<wz.p> aVar = new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsFragment.setupBinding.16.1.1.1
                                {
                                    super(0);
                                }

                                @Override // g00.a
                                public /* bridge */ /* synthetic */ wz.p invoke() {
                                    invoke2();
                                    return wz.p.f75480a;
                                }

                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    androidx.fragment.app.p activity = PostAdAddonsFragment.this.getActivity();
                                    o.g(activity, "null cannot be cast to non-null type com.forsale.app.features.postad.PLFActivity");
                                    final PostAdAddonsFragment postAdAddonsFragment5 = PostAdAddonsFragment.this;
                                    PLFActivity.R0((PLFActivity) activity, null, new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsFragment.setupBinding.16.1.1.1.1
                                        {
                                            super(0);
                                        }

                                        @Override // g00.a
                                        public /* bridge */ /* synthetic */ wz.p invoke() {
                                            invoke2();
                                            return wz.p.f75480a;
                                        }

                                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            PostAdViewModel i07;
                                            NavController a11 = androidx.navigation.fragment.a.a(PostAdAddonsFragment.this);
                                            a.b bVar = com.forsale.app.features.postad.addons.a.f34409a;
                                            i07 = PostAdAddonsFragment.this.i0();
                                            a11.d0(bVar.c(true, i07.k2().getValue()));
                                        }
                                    }, 1, null);
                                }
                            };
                            final PostAdAddonsFragment postAdAddonsFragment5 = this.f34271c;
                            PostAdDialoguesUtilsKt.m(postAdAddonsFragment3, i04, aVar, new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsFragment.setupBinding.16.1.1.2
                                {
                                    super(0);
                                }

                                @Override // g00.a
                                public /* bridge */ /* synthetic */ wz.p invoke() {
                                    invoke2();
                                    return wz.p.f75480a;
                                }

                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    PostAdAddonsFragment.this.k0();
                                }
                            });
                            break;
                        case 5:
                            PostAdAddonsFragment postAdAddonsFragment6 = this.f34271c;
                            boolean d12 = fVar.d();
                            Integer b12 = fVar.b();
                            if (b12 != null) {
                                i11 = b12.intValue();
                            }
                            List<Addon> c12 = fVar.c();
                            PostAdDialogs postAdDialogs2 = PostAdDialogs.NotEnoughCreditForAddons;
                            i05 = this.f34271c.i0();
                            PostAdDialoguesUtilsKt.o(postAdAddonsFragment6, true, d12, i11, c12, postAdDialogs2, i05);
                            break;
                        case 6:
                            PostAdAddonsFragment postAdAddonsFragment7 = this.f34271c;
                            boolean d13 = fVar.d();
                            Integer b13 = fVar.b();
                            if (b13 != null) {
                                i11 = b13.intValue();
                            }
                            List<Addon> c13 = fVar.c();
                            PostAdDialogs postAdDialogs3 = PostAdDialogs.NotEnoughCreditForAddonsEdit;
                            i06 = this.f34271c.i0();
                            PostAdDialoguesUtilsKt.o(postAdAddonsFragment7, true, d13, i11, c13, postAdDialogs3, i06);
                            break;
                        case 7:
                            final PostAdAddonsFragment postAdAddonsFragment8 = this.f34271c;
                            PostAdDialoguesUtilsKt.p(postAdAddonsFragment8, PostAdDialogs.GeneralError, new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsFragment.setupBinding.16.1.1.3
                                {
                                    super(0);
                                }

                                @Override // g00.a
                                public /* bridge */ /* synthetic */ wz.p invoke() {
                                    invoke2();
                                    return wz.p.f75480a;
                                }

                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    PostAdAddonsFragment.this.k0();
                                }
                            });
                            break;
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34268b = postAdAddonsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f34268b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            PostAdViewModel i02;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f34267a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                i02 = this.f34268b.i0();
                SharedFlow<f> U = i02.N2().U();
                C03761 c03761 = new C03761(this.f34268b, null);
                this.f34267a = 1;
                if (FlowKt.collectLatest(U, c03761, this) == f11) {
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
    public PostAdAddonsFragment$setupBinding$16(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super PostAdAddonsFragment$setupBinding$16> aVar) {
        super(2, aVar);
        this.f34266b = postAdAddonsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAddonsFragment$setupBinding$16(this.f34266b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34265a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            s viewLifecycleOwner = this.f34266b.getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34266b, null);
            this.f34265a = 1;
            if (RepeatOnLifecycleKt.b(viewLifecycleOwner, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAddonsFragment$setupBinding$16) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
