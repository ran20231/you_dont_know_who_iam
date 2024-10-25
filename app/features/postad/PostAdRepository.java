package com.forsale.app.features.postad;

import com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs;
import java.util.Set;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: PostAdRepository.kt */
/* loaded from: classes2.dex */
public final class PostAdRepository {

    /* renamed from: a  reason: collision with root package name */
    private final wz.h f33898a;

    public PostAdRepository(final jj.b preferences) {
        wz.h a11;
        o.i(preferences, "preferences");
        a11 = kotlin.d.a(new g00.a<UserPostsSharedPrefs>() { // from class: com.forsale.app.features.postad.PostAdRepository$postAdPrefs$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final UserPostsSharedPrefs invoke() {
                return jj.b.this.k();
            }
        });
        this.f33898a = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r6, zz.a<? super wz.p> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.postad.PostAdRepository$categoryImageTutorialViewed$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.postad.PostAdRepository$categoryImageTutorialViewed$1 r0 = (com.forsale.app.features.postad.PostAdRepository$categoryImageTutorialViewed$1) r0
            int r1 = r0.f33903e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33903e = r1
            goto L18
        L13:
            com.forsale.app.features.postad.PostAdRepository$categoryImageTutorialViewed$1 r0 = new com.forsale.app.features.postad.PostAdRepository$categoryImageTutorialViewed$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f33901c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f33903e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L70
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.f33900b
            java.lang.Object r2 = r0.f33899a
            com.forsale.app.features.postad.PostAdRepository r2 = (com.forsale.app.features.postad.PostAdRepository) r2
            kotlin.f.b(r7)
            goto L53
        L3e:
            kotlin.f.b(r7)
            com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs r7 = r5.e()
            r0.f33899a = r5
            r0.f33900b = r6
            r0.f33903e = r4
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Set r7 = kotlin.collections.p.b1(r7)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r7.add(r6)
            com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs r6 = r2.e()
            r2 = 0
            r0.f33899a = r2
            r0.f33903e = r3
            java.lang.Object r6 = r6.j(r7, r0)
            if (r6 != r1) goto L70
            return r1
        L70:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdRepository.b(int, zz.a):java.lang.Object");
    }

    private final UserPostsSharedPrefs e() {
        return (UserPostsSharedPrefs) this.f33898a.getValue();
    }

    public final Object c(zz.a<? super Set<String>> aVar) {
        return e().c(aVar);
    }

    public final Object d(zz.a<? super Boolean> aVar) {
        return e().b(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r7, zz.a<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.postad.PostAdRepository$isImageTutorialHasBeenViewed$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.postad.PostAdRepository$isImageTutorialHasBeenViewed$1 r0 = (com.forsale.app.features.postad.PostAdRepository$isImageTutorialHasBeenViewed$1) r0
            int r1 = r0.f33908e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33908e = r1
            goto L18
        L13:
            com.forsale.app.features.postad.PostAdRepository$isImageTutorialHasBeenViewed$1 r0 = new com.forsale.app.features.postad.PostAdRepository$isImageTutorialHasBeenViewed$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f33906c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f33908e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            int r7 = r0.f33905b
            java.lang.Object r2 = r0.f33904a
            com.forsale.app.features.postad.PostAdRepository r2 = (com.forsale.app.features.postad.PostAdRepository) r2
            kotlin.f.b(r8)
            goto L53
        L3e:
            kotlin.f.b(r8)
            com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs r8 = r6.e()
            r0.f33904a = r6
            r0.f33905b = r7
            r0.f33908e = r4
            java.lang.Object r8 = r8.e(r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            r2 = r6
        L53:
            java.util.Set r8 = (java.util.Set) r8
            java.lang.String r5 = java.lang.String.valueOf(r7)
            boolean r8 = r8.contains(r5)
            if (r8 == 0) goto L60
            goto L6d
        L60:
            r8 = 0
            r0.f33904a = r8
            r0.f33908e = r3
            java.lang.Object r7 = r2.b(r7, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            r4 = 0
        L6d:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.a.a(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdRepository.f(int, zz.a):java.lang.Object");
    }

    public final Object g(Set<String> set, zz.a<? super p> aVar) {
        Object f11;
        Object h11 = e().h(set, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (h11 == f11) {
            return h11;
        }
        return p.f75480a;
    }

    public final Object h(boolean z11, zz.a<? super p> aVar) {
        Object f11;
        Object g11 = e().g(z11, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (g11 == f11) {
            return g11;
        }
        return p.f75480a;
    }
}
