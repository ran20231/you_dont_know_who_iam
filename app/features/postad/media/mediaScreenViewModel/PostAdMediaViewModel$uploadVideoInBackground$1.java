package com.forsale.app.features.postad.media.mediaScreenViewModel;

import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.media.MediaTypes;
import com.forsale.app.utils.CoroutinesExtensionsKt;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: PostAdMediaViewModel.kt */
@d(c = "com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$uploadVideoInBackground$1", f = "PostAdMediaViewModel.kt", l = {379}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PostAdMediaViewModel$uploadVideoInBackground$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36337a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f36338b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdMediaViewModel f36339c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdMediaViewModel.kt */
    @d(c = "com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$uploadVideoInBackground$1$1", f = "PostAdMediaViewModel.kt", l = {380}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$uploadVideoInBackground$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36340a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdMediaViewModel f36341b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdMediaViewModel postAdMediaViewModel, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f36341b = postAdMediaViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f36341b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f36340a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                PostAdViewModel H0 = this.f36341b.H0();
                MediaTypes mediaTypes = MediaTypes.VIDEO;
                this.f36340a = 1;
                if (PostAdViewModel.l4(H0, mediaTypes, true, false, this, 4, null) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMediaViewModel$uploadVideoInBackground$1(PostAdMediaViewModel postAdMediaViewModel, a<? super PostAdMediaViewModel$uploadVideoInBackground$1> aVar) {
        super(2, aVar);
        this.f36339c = postAdMediaViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        PostAdMediaViewModel$uploadVideoInBackground$1 postAdMediaViewModel$uploadVideoInBackground$1 = new PostAdMediaViewModel$uploadVideoInBackground$1(this.f36339c, aVar);
        postAdMediaViewModel$uploadVideoInBackground$1.f36338b = obj;
        return postAdMediaViewModel$uploadVideoInBackground$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f36337a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f36339c, null);
            this.f36337a = 1;
            if (CoroutinesExtensionsKt.a((CoroutineScope) this.f36338b, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PostAdMediaViewModel$uploadVideoInBackground$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
