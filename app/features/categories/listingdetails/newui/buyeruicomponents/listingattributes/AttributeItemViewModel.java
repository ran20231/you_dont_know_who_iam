package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes;

import android.webkit.URLUtil;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.z;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import g00.l;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import wz.e;
import wz.p;
/* compiled from: AttributeItemViewModel.kt */
/* loaded from: classes2.dex */
public final class AttributeItemViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final AttributesMapper.AttributesDataModel f27442a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveData<TranslationRepository.Translation> f27443b;

    /* renamed from: c  reason: collision with root package name */
    private final OneShotEventHandler<String> f27444c;

    /* renamed from: d  reason: collision with root package name */
    private final OneShotEventHandler<String> f27445d;

    /* renamed from: e  reason: collision with root package name */
    private final z<String> f27446e;

    /* renamed from: f  reason: collision with root package name */
    private final z<String> f27447f;

    /* renamed from: g  reason: collision with root package name */
    private final z<String> f27448g;

    /* renamed from: h  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f27449h;

    /* renamed from: i  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f27450i;

    /* compiled from: AttributeItemViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27454a;

        static {
            int[] iArr = new int[TranslationRepository.Translation.values().length];
            try {
                iArr[TranslationRepository.Translation.ORIGINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TranslationRepository.Translation.ARABIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TranslationRepository.Translation.ENGLISH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27454a = iArr;
        }
    }

    /* compiled from: AttributeItemViewModel.kt */
    /* loaded from: classes2.dex */
    static final class b implements c0, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f27455a;

        b(l function) {
            o.i(function, "function");
            this.f27455a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final e<?> c() {
            return this.f27455a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c0) || !(obj instanceof k)) {
                return false;
            }
            return o.d(c(), ((k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // androidx.lifecycle.c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27455a.invoke(obj);
        }
    }

    public AttributeItemViewModel(AttributesMapper.AttributesDataModel attribute, LiveData<TranslationRepository.Translation> translation) {
        boolean z11;
        o.i(attribute, "attribute");
        o.i(translation, "translation");
        this.f27442a = attribute;
        this.f27443b = translation;
        this.f27444c = new OneShotEventHandler<>(null, 0, 3, null);
        this.f27445d = new OneShotEventHandler<>(null, 0, 3, null);
        z<String> zVar = new z<>();
        zVar.setValue(j(translation.getValue(), attribute.h(), attribute.i()));
        this.f27446e = zVar;
        z<String> zVar2 = new z<>();
        zVar2.setValue(j(translation.getValue(), attribute.l(), attribute.m()));
        this.f27447f = zVar2;
        z<String> zVar3 = new z<>();
        zVar3.setValue(j(translation.getValue(), "عرض", "Preview"));
        this.f27448g = zVar3;
        zVar2.b(translation, new b(new l<TranslationRepository.Translation, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItemViewModel.1
            {
                super(1);
            }

            public final void b(TranslationRepository.Translation translation2) {
                z<String> d11 = AttributeItemViewModel.this.d();
                AttributeItemViewModel attributeItemViewModel = AttributeItemViewModel.this;
                d11.setValue(attributeItemViewModel.j(translation2, attributeItemViewModel.b().l(), AttributeItemViewModel.this.b().m()));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(TranslationRepository.Translation translation2) {
                b(translation2);
                return p.f75480a;
            }
        }));
        zVar3.b(translation, new b(new l<TranslationRepository.Translation, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItemViewModel.2
            {
                super(1);
            }

            public final void b(TranslationRepository.Translation translation2) {
                AttributeItemViewModel.this.e().setValue(AttributeItemViewModel.this.j(translation2, "عرض", "Preview"));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(TranslationRepository.Translation translation2) {
                b(translation2);
                return p.f75480a;
            }
        }));
        zVar.b(translation, new b(new l<TranslationRepository.Translation, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItemViewModel.3
            {
                super(1);
            }

            public final void b(TranslationRepository.Translation translation2) {
                z<String> c11 = AttributeItemViewModel.this.c();
                AttributeItemViewModel attributeItemViewModel = AttributeItemViewModel.this;
                c11.setValue(attributeItemViewModel.j(translation2, attributeItemViewModel.b().h(), AttributeItemViewModel.this.b().i()));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(TranslationRepository.Translation translation2) {
                b(translation2);
                return p.f75480a;
            }
        }));
        OneShotEventHandler<Boolean> oneShotEventHandler = new OneShotEventHandler<>(null, 0, 3, null);
        if (attribute.j() == AttributeType.FILE) {
            z11 = true;
        } else {
            z11 = false;
        }
        oneShotEventHandler.k(Boolean.valueOf(z11));
        this.f27449h = oneShotEventHandler;
        OneShotEventHandler<Boolean> oneShotEventHandler2 = new OneShotEventHandler<>(null, 0, 3, null);
        String m11 = attribute.m();
        oneShotEventHandler2.k(Boolean.valueOf(m11 != null ? TypeExtensionsKt.Q(m11) : false));
        this.f27450i = oneShotEventHandler2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        if (r2 != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String j(com.forsale.app.datalayer.repositories.TranslationRepository.Translation r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r5 == 0) goto Ld
            boolean r2 = kotlin.text.k.v(r5)
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = r0
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r2 == 0) goto L1d
            if (r6 == 0) goto L18
            boolean r2 = kotlin.text.k.v(r6)
            if (r2 == 0) goto L19
        L18:
            r0 = r1
        L19:
            if (r0 == 0) goto L1d
            r4 = 0
            return r4
        L1d:
            if (r4 != 0) goto L21
            com.forsale.app.datalayer.repositories.TranslationRepository$Translation r4 = com.forsale.app.datalayer.repositories.TranslationRepository.Translation.ORIGINAL
        L21:
            int[] r0 = com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItemViewModel.a.f27454a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            if (r4 == r1) goto L38
            r0 = 2
            if (r4 == r0) goto L42
            r5 = 3
            if (r4 != r5) goto L32
            goto L41
        L32:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L38:
            com.forsale.app.utils.LocaleManager r4 = com.forsale.app.utils.LocaleManager.f39597a
            boolean r4 = r4.r()
            if (r4 == 0) goto L41
            goto L42
        L41:
            r5 = r6
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItemViewModel.j(com.forsale.app.datalayer.repositories.TranslationRepository$Translation, java.lang.String, java.lang.String):java.lang.String");
    }

    public final AttributesMapper.AttributesDataModel b() {
        return this.f27442a;
    }

    public final z<String> c() {
        return this.f27446e;
    }

    public final z<String> d() {
        return this.f27447f;
    }

    public final z<String> e() {
        return this.f27448g;
    }

    public final OneShotEventHandler<String> f() {
        return this.f27444c;
    }

    public final OneShotEventHandler<String> g() {
        return this.f27445d;
    }

    public final OneShotEventHandler<Boolean> h() {
        return this.f27449h;
    }

    public final void i() {
        String m11 = this.f27442a.m();
        if (!URLUtil.isNetworkUrl(m11)) {
            return;
        }
        boolean z11 = false;
        if (m11 != null && TypeExtensionsKt.Q(m11)) {
            z11 = true;
        }
        if (z11) {
            this.f27445d.k(m11);
        } else if (m11 != null) {
            this.f27444c.k(m11);
        }
    }
}
