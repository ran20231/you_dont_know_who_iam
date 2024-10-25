package com.forsale.app.features.postad.bundles;

import com.forsale.app.features.postad.PLFActivity;
import com.forsale.app.features.postad.PostAdDialogs;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.addons.PostAdDialoguesUtilsKt;
import com.forsale.app.utils.NavigationUtilsKt;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: PostAdBundlesFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesFragment$registerObservers$3", f = "PostAdBundlesFragment.kt", l = {164}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PostAdBundlesFragment$registerObservers$3 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34989a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdBundlesFragment f34990b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdBundlesFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesFragment$registerObservers$3$1", f = "PostAdBundlesFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$registerObservers$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<com.forsale.app.features.postad.f, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34991a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f34992b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdBundlesFragment f34993c;

        /* compiled from: PostAdBundlesFragment.kt */
        /* renamed from: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$registerObservers$3$1$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f34998a;

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
                f34998a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdBundlesFragment postAdBundlesFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34993c = postAdBundlesFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(com.forsale.app.features.postad.f fVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(fVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34993c, aVar);
            anonymousClass1.f34992b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f34991a == 0) {
                kotlin.f.b(obj);
                com.forsale.app.features.postad.f fVar = (com.forsale.app.features.postad.f) this.f34992b;
                int i11 = -1;
                switch (a.f34998a[fVar.a().ordinal()]) {
                    case 1:
                        PostAdDialoguesUtilsKt.n(this.f34993c);
                        break;
                    case 2:
                        PostAdBundlesFragment postAdBundlesFragment = this.f34993c;
                        PostAdDialoguesUtilsKt.q(postAdBundlesFragment, postAdBundlesFragment.H());
                        break;
                    case 3:
                        PostAdBundlesFragment postAdBundlesFragment2 = this.f34993c;
                        boolean d11 = fVar.d();
                        Integer b11 = fVar.b();
                        if (b11 != null) {
                            i11 = b11.intValue();
                        }
                        PostAdDialoguesUtilsKt.o(postAdBundlesFragment2, false, d11, i11, fVar.c(), PostAdDialogs.UploadMediaFailed, this.f34993c.H());
                        break;
                    case 4:
                        PostAdBundlesFragment postAdBundlesFragment3 = this.f34993c;
                        PostAdViewModel H = postAdBundlesFragment3.H();
                        final PostAdBundlesFragment postAdBundlesFragment4 = this.f34993c;
                        g00.a<p> aVar = new g00.a<p>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment.registerObservers.3.1.1
                            {
                                super(0);
                            }

                            @Override // g00.a
                            public /* bridge */ /* synthetic */ p invoke() {
                                invoke2();
                                return p.f75480a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                androidx.fragment.app.p activity = PostAdBundlesFragment.this.getActivity();
                                o.g(activity, "null cannot be cast to non-null type com.forsale.app.features.postad.PLFActivity");
                                final PostAdBundlesFragment postAdBundlesFragment5 = PostAdBundlesFragment.this;
                                PLFActivity.R0((PLFActivity) activity, null, new g00.a<p>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment.registerObservers.3.1.1.1
                                    {
                                        super(0);
                                    }

                                    @Override // g00.a
                                    public /* bridge */ /* synthetic */ p invoke() {
                                        invoke2();
                                        return p.f75480a;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        NavigationUtilsKt.d(androidx.navigation.fragment.a.a(PostAdBundlesFragment.this), f.f35078a.d(true, PostAdBundlesFragment.this.H().k2().getValue()), null, 2, null);
                                    }
                                }, 1, null);
                            }
                        };
                        final PostAdBundlesFragment postAdBundlesFragment5 = this.f34993c;
                        PostAdDialoguesUtilsKt.m(postAdBundlesFragment3, H, aVar, new g00.a<p>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment.registerObservers.3.1.2
                            {
                                super(0);
                            }

                            @Override // g00.a
                            public /* bridge */ /* synthetic */ p invoke() {
                                invoke2();
                                return p.f75480a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                PostAdBundlesFragment.this.I().K();
                            }
                        });
                        break;
                    case 5:
                        PostAdBundlesFragment postAdBundlesFragment6 = this.f34993c;
                        boolean d12 = fVar.d();
                        Integer b12 = fVar.b();
                        if (b12 != null) {
                            i11 = b12.intValue();
                        }
                        PostAdDialoguesUtilsKt.o(postAdBundlesFragment6, true, d12, i11, fVar.c(), PostAdDialogs.NotEnoughCreditForAddons, this.f34993c.H());
                        break;
                    case 6:
                        PostAdBundlesFragment postAdBundlesFragment7 = this.f34993c;
                        boolean d13 = fVar.d();
                        Integer b13 = fVar.b();
                        if (b13 != null) {
                            i11 = b13.intValue();
                        }
                        PostAdDialoguesUtilsKt.o(postAdBundlesFragment7, true, d13, i11, fVar.c(), PostAdDialogs.NotEnoughCreditForAddonsEdit, this.f34993c.H());
                        break;
                    case 7:
                        final PostAdBundlesFragment postAdBundlesFragment8 = this.f34993c;
                        PostAdDialoguesUtilsKt.p(postAdBundlesFragment8, PostAdDialogs.GeneralError, new g00.a<p>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment.registerObservers.3.1.3
                            {
                                super(0);
                            }

                            @Override // g00.a
                            public /* bridge */ /* synthetic */ p invoke() {
                                invoke2();
                                return p.f75480a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                PostAdBundlesFragment.this.I().K();
                            }
                        });
                        break;
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdBundlesFragment$registerObservers$3(PostAdBundlesFragment postAdBundlesFragment, zz.a<? super PostAdBundlesFragment$registerObservers$3> aVar) {
        super(1, aVar);
        this.f34990b = postAdBundlesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdBundlesFragment$registerObservers$3(this.f34990b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34989a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<com.forsale.app.features.postad.f> U = this.f34990b.H().N2().U();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34990b, null);
            this.f34989a = 1;
            if (FlowKt.collectLatest(U, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdBundlesFragment$registerObservers$3) create(aVar)).invokeSuspend(p.f75480a);
    }
}
