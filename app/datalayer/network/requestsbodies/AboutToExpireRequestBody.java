package com.forsale.app.datalayer.network.requestsbodies;

import com.forsale.app.datalayer.repositories.TranslationRepository;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: AboutToExpireRequestBody.kt */
/* loaded from: classes2.dex */
public final class AboutToExpireRequestBody {
    public static final int $stable = 0;
    @c("thumb_size")
    private final int thumbSize;
    @c(AdvancedSearchBody.TRANSLATION)
    private final TranslationRepository.Translation translation;

    public AboutToExpireRequestBody() {
        this(0, null, 3, null);
    }

    public final int getThumbSize() {
        return this.thumbSize;
    }

    public final TranslationRepository.Translation getTranslation() {
        return this.translation;
    }

    public AboutToExpireRequestBody(int i11, TranslationRepository.Translation translation) {
        o.i(translation, "translation");
        this.thumbSize = i11;
        this.translation = translation;
    }

    public /* synthetic */ AboutToExpireRequestBody(int i11, TranslationRepository.Translation translation, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 300 : i11, (i12 & 2) != 0 ? TranslationRepository.Translation.ORIGINAL : translation);
    }
}
