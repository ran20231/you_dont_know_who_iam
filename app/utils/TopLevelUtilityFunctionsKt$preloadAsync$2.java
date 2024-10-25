package com.forsale.app.utils;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import p7.Target;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TopLevelUtilityFunctions.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.TopLevelUtilityFunctionsKt$preloadAsync$2", f = "TopLevelUtilityFunctions.kt", l = {271}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TopLevelUtilityFunctionsKt$preloadAsync$2 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f39656a;

    /* renamed from: b  reason: collision with root package name */
    int f39657b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.bumptech.glide.f<Drawable> f39658c;

    /* compiled from: TopLevelUtilityFunctions.kt */
    /* loaded from: classes3.dex */
    public static final class a implements com.bumptech.glide.request.g<Drawable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ zz.a<wz.p> f39659a;

        /* JADX WARN: Multi-variable type inference failed */
        a(zz.a<? super wz.p> aVar) {
            this.f39659a = aVar;
        }

        @Override // com.bumptech.glide.request.g
        /* renamed from: a */
        public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z11) {
            if (drawable != null) {
                zz.a<wz.p> aVar = this.f39659a;
                Result.a aVar2 = Result.f61613b;
                aVar.resumeWith(Result.b(wz.p.f75480a));
                return false;
            }
            return false;
        }

        @Override // com.bumptech.glide.request.g
        public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z11) {
            if (glideException != null) {
                zz.a<wz.p> aVar = this.f39659a;
                Result.a aVar2 = Result.f61613b;
                aVar.resumeWith(Result.b(kotlin.f.a(glideException)));
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopLevelUtilityFunctionsKt$preloadAsync$2(com.bumptech.glide.f<Drawable> fVar, zz.a<? super TopLevelUtilityFunctionsKt$preloadAsync$2> aVar) {
        super(2, aVar);
        this.f39658c = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new TopLevelUtilityFunctionsKt$preloadAsync$2(this.f39658c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        zz.a d11;
        Object f12;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39657b;
        if (i11 != 0) {
            if (i11 == 1) {
                com.bumptech.glide.f fVar = (com.bumptech.glide.f) this.f39656a;
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            com.bumptech.glide.f<Drawable> fVar2 = this.f39658c;
            this.f39656a = fVar2;
            this.f39657b = 1;
            d11 = IntrinsicsKt__IntrinsicsJvmKt.d(this);
            zz.c cVar = new zz.c(d11);
            fVar2.o0(new a(cVar)).N0();
            Object a11 = cVar.a();
            f12 = kotlin.coroutines.intrinsics.b.f();
            if (a11 == f12) {
                kotlin.coroutines.jvm.internal.f.c(this);
            }
            if (a11 == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((TopLevelUtilityFunctionsKt$preloadAsync$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
