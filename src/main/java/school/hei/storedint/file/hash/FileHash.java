package school.hei.storedint.file.hash;

import school.hei.storedint.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
